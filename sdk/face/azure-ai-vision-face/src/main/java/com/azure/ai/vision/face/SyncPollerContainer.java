package com.azure.ai.vision.face;

import com.azure.core.util.polling.SyncPoller;

public class SyncPollerContainer<TActivationResult, TOperationStatus, TOperationResult>  {
    private final TActivationResult activationResult;
    private final SyncPoller<TOperationStatus, TOperationResult> syncPoller;

    SyncPollerContainer(TActivationResult activationResult, SyncPoller<TOperationStatus, TOperationResult> syncPoller) {
        this.activationResult = activationResult;
        this.syncPoller = syncPoller;
    }

    public TActivationResult getActivationResult() {
        return activationResult;
    }

    public SyncPoller<TOperationStatus, TOperationResult> getSyncPoller() {
        return syncPoller;
    }
}
