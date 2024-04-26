// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face;

import com.azure.ai.vision.face.implementation.models.FaceAttributeType;
import com.azure.ai.vision.face.implementation.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.*;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.BinaryData;
import com.azure.core.util.ExpandableStringEnum;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static com.azure.ai.vision.face.Utils.log;

public final class DetectSamples {
    private static final ApplicationManager APPLICATION_MANAGER = new ApplicationManager();

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "8888");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyPort", "8888");
//        System.setProperty("javax.net.ssl.trustStore", "e:\\FiddlerKeystore");
//        System.setProperty("javax.net.ssl.trustStorePassword", "leareai");
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();


        log("accountName:" + endpoint + ", accountKey:" + accountKey + ", dir:" + System.getProperty("user.dir"));

//        var request = HttpRequest.newBuilder()
//            .uri(new URI("http://localhost:8081/detect"))
//            .setHeader("apim-subscription-id", "lel")
//            .setHeader("Content-Type","application/octet-stream")
//            .POST(HttpRequest.BodyPublishers.ofFile(
//                Path.of(SampleUtils.TEST_IMAGE_PATH_FAMILY1_DAD1)))
//            .build();
//        var httpClient = HttpClient.newHttpClient();
//        HttpResponse<String> resp = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        log("result:"+resp.body());

        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
//            .credential(new DefaultAzureCredentialBuilder()
            .buildClient();


        Path path = FileSystems.getDefault().getPath(Utils.TEST_IMAGE_PATH_FAMILY1_DAD1);
        BinaryData data = BinaryData.fromFile(path);
        List<FaceDetectionResult> results = client.detect(data,
            true,
            null,
            null,
            FaceRecognitionModel.RECOGNITION_04,
            null, FaceDetectionModel.DETECTION_03,
            null);

        FaceDetectionResult result = results.get(0);
        log("result:" + result.getFaceId());

//
//        RequestOptions requestOptions = new RequestOptions();
//        requestOptions.setHeader("apim-subscription-id", "lel");
//
//        Response<BinaryData> response = client.detectWithResponse(data, requestOptions);
//        log("result:"+response.getStatusCode());




//        client.verifyFaceToFace(result.getFaceId(), result.getFaceId());

        FaceAdministrationClient administrationClient = new FaceAdministrationClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
//            .credential(new DefaultAzureCredentialBuilder()
            .buildClient();

//        LargePersonGroup lpg = new LargePersonGroup("Bill");
//        lpg.setUserData("No data");
//        String id = "lpg01";
//        administrationClient.createLargePersonGroup(id, lpg);
//        SyncPoller<CollectionTrainingStatus, Void>  poller = administrationClient.beginTrainPersonGroup(id);
//        PollResponse<CollectionTrainingStatus> response = poller.waitForCompletion();
//        CollectionTrainingStatus status = response.getValue();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        SyncPollerContainer<CreatePersonResult, FaceOperationStatus,Void> completeResult = administrationClient.beginCreatePerson("Leo", "Test");
        SyncPoller<FaceOperationStatus,Void> syncPoller = completeResult.getSyncPoller();
        CreatePersonResult createPersonResult = completeResult.getActivationResult();
        String personId = createPersonResult.getPersonId();
        log("Person Result:"+personId);
        PollResponse<FaceOperationStatus> pollResponse;
        while((pollResponse = syncPoller.poll()).getStatus() == LongRunningOperationStatus.IN_PROGRESS) {
            log("poll Result:"+objectMapper.writeValueAsString(pollResponse.getValue()));
        }

        log("poll complete:"+objectMapper.writeValueAsString(pollResponse.getValue()));



//        var createPersonResultResponse = administrationClient.createPersonWithResponse(request, requestOptions);
//        var createPersonResult = createPersonResultResponse.getValue().toObject(CreatePersonResult.class);
//        var operationId = createPersonResultResponse.getHeaders().getValue(HttpHeaderName.fromString("operation-location"));
//        String personId = createPersonResult.getPersonId();
//        log("Person Result:"+createPersonResult+", operationId:"+operationId);
//        AddFaceResult addFaceResult = administrationClient.addPersonFace(personId, FaceRecognitionModel.RECOGNITION_04, data);
//        log("Add Face to Person Result:"+objectMapper.writeValueAsString(addFaceResult));
        SyncPoller<FaceOperationStatus, Void> deletePoller = administrationClient.beginDeletePerson(personId);
        log("begin delete:"+deletePoller.poll().getStatus());
        PollResponse<FaceOperationStatus> pollerStatus  = deletePoller.waitForCompletion();
        log("delete result:"+objectMapper.writeValueAsString(pollerStatus));



//
//        FaceSessionClient faceSessionClient = new FaceSessionClientBuilder()
//            .endpoint(endpoint)
//            .credential(new DefaultAzureCredentialBuilder().build())
//            .buildClient();
//
//        LivenessSessionCreationContent content = new LivenessSessionCreationContent("Passive", "device_"+ UUID.randomUUID())
//            .setSendResultsToClient(true)
//            .setAuthTokenTimeToLiveInSeconds(60)
//            .setDeviceCorrelationIdSetInClient(true);
//
//        LivenessSessionCreationResult livenessSessionCreationResult = faceSessionClient.createLivenessSession(content);
//        log("livenessSessionCreationResult:"+objectMapper.writeValueAsString(livenessSessionCreationResult));
//
//        List<LivenessSessionItem> sessions = faceSessionClient.getLivenessSessions();
//        log("livenessSession:"+objectMapper.writeValueAsString(sessions));
//
//        LivenessSession livenessSession = faceSessionClient.getLivenessSession(livenessSessionCreationResult.getSessionId());
//        log("livenessSession:"+objectMapper.writeValueAsString(livenessSession));
//        log("result:"+objectMapper.writeValueAsString(livenessSession.getResult()));
//        log("id:"+livenessSession.getId()+", status:"+livenessSession.getStatus()+", createdDateTime:"+livenessSession.getCreatedDateTime()+
//            ", sessionStartDateTime:"+livenessSession.getSessionStartDateTime()+", sessionExpired:"+livenessSession.isSessionExpired());
//
//        List<LivenessSessionAuditEntry> livenessSessionAuditEntries = faceSessionClient.getLivenessSessionAuditEntries(livenessSessionCreationResult.getSessionId());
//        log("livenessSessionAuditEntries:"+objectMapper.writeValueAsString(livenessSessionAuditEntries));
//
//        faceSessionClient.deleteLivenessSession(livenessSessionCreationResult.getSessionId());
//        LivenessSessionCreationContentForMultipart parameters = new LivenessSessionCreationContentForMultipart("Passive", "device_"+ UUID.randomUUID())
//            .setSendResultsToClient(true)
//            .setAuthTokenTimeToLiveInSeconds(60);
//
//        VerifyImageFileDetails verifyImageFileDetails = new VerifyImageFileDetails(data);
//        LivenessSessionWithVerifyImageCreationContent contentWithVerifyImage = new LivenessSessionWithVerifyImageCreationContent(
//            parameters, verifyImageFileDetails);
//        LivenessSessionCreationResult livenessSessionCreationResultWithVerify = faceSessionClient.createLivenessWithVerifySessionWithVerifyImage(contentWithVerifyImage);
//        log("livenessSessionCreationResult:"+objectMapper.writeValueAsString(livenessSessionCreationResultWithVerify)+", contentWithVerifyImage:"+contentWithVerifyImage.getVerifyImage().getFilename());

//        faceSessionClient.



//        client.detectWithResponse()

//        Response<BinaryData> binaryDataResponse = client.detectWithResponse(data, new RequestOptions());
//
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_01,
//            new FaceAttributeType[] {FaceAttributeType.AGE, FaceAttributeType.ACCESSORIES, FaceAttributeType.BLUR, FaceAttributeType.EMOTION, FaceAttributeType.EXPOSURE,
//                FaceAttributeType.FACIAL_HAIR, FaceAttributeType.GENDER, FaceAttributeType.GLASSES, FaceAttributeType.HAIR, FaceAttributeType.HEAD_POSE,
//                FaceAttributeType.MAKEUP, FaceAttributeType.NOISE, FaceAttributeType.OCCLUSION, FaceAttributeType.QUALITY_FOR_RECOGNITION, FaceAttributeType.SMILE, FaceAttributeType.MASK});

//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_01,
//            Arrays.asList(FaceAttributeType.ACCESSORIES, FaceAttributeType.BLUR,  FaceAttributeType.EXPOSURE,
//                FaceAttributeType.GLASSES, FaceAttributeType.HEAD_POSE,
//                FaceAttributeType.NOISE, FaceAttributeType.OCCLUSION, FaceAttributeType.QUALITY_FOR_RECOGNITION,
//                MyFaceAttributeType.AGE,
//                MyFaceAttributeType.EMOTION,
//                MyFaceAttributeType.FACIAL_HAIR,
//                MyFaceAttributeType.GENDER,
//                MyFaceAttributeType.HAIR,
//                MyFaceAttributeType.MAKEUP,
//                MyFaceAttributeType.SMILE));
//
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_02, null);
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_03,
//            Arrays.asList(FaceAttributeType.HEAD_POSE, FaceAttributeType.MASK, FaceAttributeType.QUALITY_FOR_RECOGNITION));


//        FaceAsyncClient asyncClient = new FaceClientBuilder()
//            .endpoint(endpoint)
//            .credential(new AzureKeyCredential(accountKey))
//            .buildAsyncClient();
//
//        Mono<List<FaceDetectionResult>> listMono =  asyncClient.detect(data);
//        log("start");
//        listMono
//            .subscribeOn(Schedulers.boundedElastic())
//            .subscribe(result -> {
//            try {
//                Thread.sleep(1000);
//                log(
//                    "Face:"+objectMapper.writeValueAsString(result));
//            } catch (JsonProcessingException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            sApplicationManager.stopApplication();
//            log("Done");
//        });

        log("end");

//        sApplicationManager.waitingForApplicationStop();
    }

    private static void testModel(
        FaceClient client,
        ObjectMapper objectMapper,
        BinaryData data,
        FaceRecognitionModel recognitionModel,
        FaceDetectionModel detectionModel,
        List<FaceAttributeType> attributesArray) {

        List<FaceDetectionResult> results = client.detect(
            data,
            true,
            detectionModel != FaceDetectionModel.DETECTION_02,
            attributesArray,
            recognitionModel,
            true, detectionModel,
            86400);

        results.forEach(result -> {
            try {
                log(
                    "Face:" + objectMapper.writeValueAsString(result));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
    }
    static class MyFaceAttributeType extends ExpandableStringEnum<MyFaceAttributeType> {
        public static final FaceAttributeType AGE = fromString("age");
        public static final FaceAttributeType EMOTION = fromString("emotion");
        public static final FaceAttributeType FACIAL_HAIR = fromString("facialhair");
        public static final FaceAttributeType GENDER = fromString("gender");
        public static final FaceAttributeType HAIR = fromString("hair");
        public static final FaceAttributeType MAKEUP = fromString("makeup");
        public static final FaceAttributeType SMILE = fromString("smile");

        public static FaceAttributeType fromString(String name) {
            return fromString(name, FaceAttributeType.class);
        }

        public static String getQueryParametersForAttributes(FaceAttributeType... attributes) {
            if (attributes == null) {
                return null;
            }

            HashSet<FaceAttributeType> attributesSet = new HashSet<>();
            Collections.addAll(attributesSet, attributes);

            return getQueryParametersForAttributes(attributesSet);
        }

        public static String getQueryParametersForAttributes(HashSet<FaceAttributeType> attributesSet) {
            if (attributesSet == null || attributesSet.isEmpty()) {
                return null;
            }

            StringBuilder sb = new StringBuilder();
            attributesSet.forEach(faceAttribute -> sb.append(faceAttribute.toString()).append(','));
            log(sb.toString());
            if (!attributesSet.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }

            return sb.toString();
        }
    }
}
