// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RecognizeOptionsInternal model. */
@Fluent
public final class RecognizeOptionsInternal {
    /*
     * Determines if we interrupt the prompt and start recognizing.
     */
    @JsonProperty(value = "interruptPrompt")
    private Boolean interruptPrompt;

    /*
     * Time to wait for first input after prompt (if any).
     */
    @JsonProperty(value = "initialSilenceTimeoutInSeconds")
    private Integer initialSilenceTimeoutInSeconds;

    /*
     * Target participant of DTMF tone recognition.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * Defines configurations for DTMF.
     */
    @JsonProperty(value = "dtmfOptions")
    private DtmfOptionsInternal dtmfOptions;

    /*
     * Defines Ivr choices for recognize.
     */
    @JsonProperty(value = "choices")
    private List<RecognizeChoiceInternal> choices;

    /**
     * Get the interruptPrompt property: Determines if we interrupt the prompt and start recognizing.
     *
     * @return the interruptPrompt value.
     */
    public Boolean isInterruptPrompt() {
        return this.interruptPrompt;
    }

    /**
     * Set the interruptPrompt property: Determines if we interrupt the prompt and start recognizing.
     *
     * @param interruptPrompt the interruptPrompt value to set.
     * @return the RecognizeOptionsInternal object itself.
     */
    public RecognizeOptionsInternal setInterruptPrompt(Boolean interruptPrompt) {
        this.interruptPrompt = interruptPrompt;
        return this;
    }

    /**
     * Get the initialSilenceTimeoutInSeconds property: Time to wait for first input after prompt (if any).
     *
     * @return the initialSilenceTimeoutInSeconds value.
     */
    public Integer getInitialSilenceTimeoutInSeconds() {
        return this.initialSilenceTimeoutInSeconds;
    }

    /**
     * Set the initialSilenceTimeoutInSeconds property: Time to wait for first input after prompt (if any).
     *
     * @param initialSilenceTimeoutInSeconds the initialSilenceTimeoutInSeconds value to set.
     * @return the RecognizeOptionsInternal object itself.
     */
    public RecognizeOptionsInternal setInitialSilenceTimeoutInSeconds(Integer initialSilenceTimeoutInSeconds) {
        this.initialSilenceTimeoutInSeconds = initialSilenceTimeoutInSeconds;
        return this;
    }

    /**
     * Get the targetParticipant property: Target participant of DTMF tone recognition.
     *
     * @return the targetParticipant value.
     */
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: Target participant of DTMF tone recognition.
     *
     * @param targetParticipant the targetParticipant value to set.
     * @return the RecognizeOptionsInternal object itself.
     */
    public RecognizeOptionsInternal setTargetParticipant(CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the dtmfOptions property: Defines configurations for DTMF.
     *
     * @return the dtmfOptions value.
     */
    public DtmfOptionsInternal getDtmfOptions() {
        return this.dtmfOptions;
    }

    /**
     * Set the dtmfOptions property: Defines configurations for DTMF.
     *
     * @param dtmfOptions the dtmfOptions value to set.
     * @return the RecognizeOptionsInternal object itself.
     */
    public RecognizeOptionsInternal setDtmfOptions(DtmfOptionsInternal dtmfOptions) {
        this.dtmfOptions = dtmfOptions;
        return this;
    }

    /**
     * Get the choices property: Defines Ivr choices for recognize.
     *
     * @return the choices value.
     */
    public List<RecognizeChoiceInternal> getChoices() {
        return this.choices;
    }

    /**
     * Set the choices property: Defines Ivr choices for recognize.
     *
     * @param choices the choices value to set.
     * @return the RecognizeOptionsInternal object itself.
     */
    public RecognizeOptionsInternal setChoices(List<RecognizeChoiceInternal> choices) {
        this.choices = choices;
        return this;
    }
}
