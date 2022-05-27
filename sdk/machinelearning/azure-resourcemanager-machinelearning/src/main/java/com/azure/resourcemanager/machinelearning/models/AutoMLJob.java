// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * AutoMLJob class. Use this class for executing AutoML tasks like Classification/Regression etc. See TaskType enum for
 * all the tasks supported.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("AutoML")
@Fluent
public final class AutoMLJob extends JobBaseDetails {
    /*
     * The ARM resource ID of the Environment specification for the job.
     * This is optional value to provide, if not provided, AutoML will default
     * this to Production AutoML curated environment version when running the
     * job.
     */
    @JsonProperty(value = "environmentId")
    private String environmentId;

    /*
     * Environment variables included in the job.
     */
    @JsonProperty(value = "environmentVariables")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> environmentVariables;

    /*
     * Mapping of output data bindings used in the job.
     */
    @JsonProperty(value = "outputs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, JobOutput> outputs;

    /*
     * Compute Resource configuration for the job.
     */
    @JsonProperty(value = "resources")
    private ResourceConfiguration resources;

    /*
     * [Required] This represents scenario which can be one of Tables/NLP/Image
     */
    @JsonProperty(value = "taskDetails", required = true)
    private AutoMLVertical taskDetails;

    /**
     * Get the environmentId property: The ARM resource ID of the Environment specification for the job. This is
     * optional value to provide, if not provided, AutoML will default this to Production AutoML curated environment
     * version when running the job.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: The ARM resource ID of the Environment specification for the job. This is
     * optional value to provide, if not provided, AutoML will default this to Production AutoML curated environment
     * version when running the job.
     *
     * @param environmentId the environmentId value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the environmentVariables property: Environment variables included in the job.
     *
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Environment variables included in the job.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the outputs property: Mapping of output data bindings used in the job.
     *
     * @return the outputs value.
     */
    public Map<String, JobOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Mapping of output data bindings used in the job.
     *
     * @param outputs the outputs value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withOutputs(Map<String, JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the resources property: Compute Resource configuration for the job.
     *
     * @return the resources value.
     */
    public ResourceConfiguration resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Compute Resource configuration for the job.
     *
     * @param resources the resources value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withResources(ResourceConfiguration resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the taskDetails property: [Required] This represents scenario which can be one of Tables/NLP/Image.
     *
     * @return the taskDetails value.
     */
    public AutoMLVertical taskDetails() {
        return this.taskDetails;
    }

    /**
     * Set the taskDetails property: [Required] This represents scenario which can be one of Tables/NLP/Image.
     *
     * @param taskDetails the taskDetails value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withTaskDetails(AutoMLVertical taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withComputeId(String computeId) {
        super.withComputeId(computeId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withExperimentName(String experimentName) {
        super.withExperimentName(experimentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withIdentity(IdentityConfiguration identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withSchedule(ScheduleBase schedule) {
        super.withSchedule(schedule);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withServices(Map<String, JobService> services) {
        super.withServices(services);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoMLJob withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (outputs() != null) {
            outputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (resources() != null) {
            resources().validate();
        }
        if (taskDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property taskDetails in model AutoMLJob"));
        } else {
            taskDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoMLJob.class);
}
