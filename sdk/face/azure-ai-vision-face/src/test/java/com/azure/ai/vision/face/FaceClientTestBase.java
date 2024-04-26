// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face;

import com.azure.core.client.traits.*;
import com.azure.core.credential.KeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.HashMap;
import java.util.function.Function;

public class FaceClientTestBase {
    private static final HashMap<Class<?>, Function<FaceClientTestBase, Object>> TYPE_MAP = new HashMap<Class<?>, Function<FaceClientTestBase, Object>>() {{
            put(FaceClient.class, testBase -> testBase.configureForTestMode(new FaceClientBuilder()).buildClient());
            put(FaceAsyncClient.class, testBase -> testBase.configureForTestMode(new FaceClientBuilder()).buildAsyncClient());
            put(FaceAdministrationClient.class, testBase -> testBase.configureForTestMode(new FaceAdministrationClientBuilder()).buildClient());
            put(FaceAdministrationAsyncClient.class, testBase -> testBase.configureForTestMode(new FaceAdministrationClientBuilder()).buildAsyncClient());
            put(FaceSessionClient.class, testBase -> testBase.configureForTestMode(new FaceSessionClientBuilder()).buildClient());
            put(FaceSessionAsyncClient.class, testBase -> testBase.configureForTestMode(new FaceSessionClientBuilder()).buildAsyncClient());
        }};

    @SuppressWarnings("unchecked")
    protected <T> T createClient(Class<T> clazz) {
        Function<FaceClientTestBase, Object> creator = TYPE_MAP.get(clazz);
        if (null == creator) {
            throw new IllegalArgumentException("No such client type: " + clazz);
        }

        return (T) creator.apply(this);
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T> & EndpointTrait<T>> T configureForTestMode(T clientBuilder) {
        clientBuilder.endpoint(ConfigurationHelper.getEndpoint())
            .httpClient(HttpClient.createDefault())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
//            .httpClient(HttpClient.createDefault())
//            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

//        return switch (getTestMode()) {
//            case PLAYBACK -> configureForPlayBackMode(clientBuilder);
//            case RECORD -> configureForRecordMode(clientBuilder);
//            case LIVE -> configureForLiveMode(clientBuilder);
//        };

        return configureForLiveMode(clientBuilder);
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureCredential(T clientBuilder) {
        String accountKey = ConfigurationHelper.getAccountKey();
        if (accountKey != null && !accountKey.isEmpty()) {
            return clientBuilder.credential(new KeyCredential(accountKey));
        }

        return clientBuilder.credential(new DefaultAzureCredentialBuilder().build());
    }

//    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForPlayBackMode(T clientBuilder) {
//        return clientBuilder
//            .httpClient(interceptorManager.getPlaybackClient())
//            .credential(new MockTokenCredential());
//    }
//
//    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForRecordMode(T clientBuilder) {
//        return configureCredential(clientBuilder)
//            .addPolicy(interceptorManager.getRecordPolicy());
//    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForLiveMode(T clientBuilder) {
        return configureCredential(clientBuilder);
    }
}

