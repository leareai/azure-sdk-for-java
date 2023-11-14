// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.jms;

import com.azure.spring.cloud.autoconfigure.condition.ConditionalOnMissingProperty;
import com.azure.spring.cloud.autoconfigure.context.AzureGlobalProperties;
import com.azure.spring.cloud.autoconfigure.jms.implementation.AzureServiceBusJmsConnectionFactoryCustomizer;
import com.azure.spring.cloud.autoconfigure.jms.properties.AzureServiceBusJmsProperties;
import com.azure.spring.cloud.autoconfigure.resourcemanager.AzureServiceBusResourceManagerAutoConfiguration;
import com.azure.spring.cloud.core.implementation.util.AzurePasswordlessPropertiesUtils;
import com.azure.spring.cloud.core.implementation.util.ReflectionUtils;
import com.azure.spring.cloud.core.provider.connectionstring.ServiceConnectionStringProvider;
import com.azure.spring.cloud.core.service.AzureServiceType;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactory;
import org.apache.qpid.jms.JmsConnectionExtensions;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import java.net.URI;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * {@link EnableAutoConfiguration Auto-configuration} for Azure Service Bus JMS support.
 *
 * @since 4.0.0
 */
@Configuration(proxyBeanMethods = false)
@AutoConfigureBefore(JmsAutoConfiguration.class)
@AutoConfigureAfter({
    JndiConnectionFactoryAutoConfiguration.class,
    AzureServiceBusResourceManagerAutoConfiguration.class })
@ConditionalOnProperty(value = "spring.jms.servicebus.enabled", matchIfMissing = true)
@ConditionalOnClass({ ConnectionFactory.class, JmsConnectionFactory.class, JmsTemplate.class })
@EnableConfigurationProperties({ JmsProperties.class })
@Import({ ServiceBusJmsConnectionFactoryConfiguration.class, ServiceBusJmsContainerConfiguration.class })
public class ServiceBusJmsAutoConfiguration {

    @Bean
    AzureServiceBusJmsProperties serviceBusJmsProperties(AzureGlobalProperties azureGlobalProperties) {
        AzureServiceBusJmsProperties properties = new AzureServiceBusJmsProperties();
        return mergeAzureProperties(azureGlobalProperties, properties);
    }

    @Bean
    @ConditionalOnExpression("'standard'.equalsIgnoreCase('${spring.jms.servicebus.pricing-tier}')")
    @SuppressWarnings("unchecked")
    AzureServiceBusJmsConnectionFactoryCustomizer amqpOpenPropertiesCustomizer(ObjectProvider<AzureServiceBusJmsCredentialSupplier> azureServiceBusJmsCredentialSupplier) {
        return factory -> {
            JmsConnectionFactory jmsFactory = (JmsConnectionFactory) ReflectionUtils.getField(ServiceBusJmsConnectionFactory.class, "factory", factory);
            EnumMap<JmsConnectionExtensions, BiFunction<Connection, URI, Object>> extensionMap =
                (EnumMap) ReflectionUtils.getField(JmsConnectionFactory.class, "extensionMap", jmsFactory);
            if (extensionMap.containsKey(JmsConnectionExtensions.AMQP_OPEN_PROPERTIES)) {
                Map<String, Object> properties = (Map) extensionMap.get(JmsConnectionExtensions.AMQP_OPEN_PROPERTIES).apply(null, null);
                if (properties.containsKey("com.microsoft:is-client-provider")) {
                    jmsFactory.setExtension(JmsConnectionExtensions.AMQP_OPEN_PROPERTIES.toString(),
                        (connection, uri) -> {
                            properties.remove("com.microsoft:is-client-provider");
                            return properties;
                        });
                }
            }
        };
    }

    /**
     * The BeanPostProcessor to instrument the {@link AzureServiceBusJmsProperties} bean with provided connection string
     * providers.
     * @param connectionStringProviders the connection string providers to provide the Service Bus connection string.
     * @return the bean post processor.
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnMissingProperty(prefix = "spring.jms.servicebus", name = "connection-string")
    static AzureServiceBusJmsPropertiesBeanPostProcessor azureServiceBusJmsPropertiesBeanPostProcessor(
        ObjectProvider<ServiceConnectionStringProvider<AzureServiceType.ServiceBus>> connectionStringProviders) {
        return new AzureServiceBusJmsPropertiesBeanPostProcessor(connectionStringProviders);
    }

    private AzureServiceBusJmsProperties mergeAzureProperties(AzureGlobalProperties azureGlobalProperties, AzureServiceBusJmsProperties azurePasswordlessProperties) {
        AzureServiceBusJmsProperties mergedProperties = new AzureServiceBusJmsProperties();
        AzurePasswordlessPropertiesUtils.mergeAzureCommonProperties(azureGlobalProperties, azurePasswordlessProperties, mergedProperties);
        return mergedProperties;
    }
}
