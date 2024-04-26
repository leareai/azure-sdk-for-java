// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face;

import com.azure.ai.vision.face.implementation.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

import static com.azure.ai.vision.face.Utils.log;

public class SendTest extends FaceClientTestBase {

    @Test
    public void runTest() throws URISyntaxException, IOException, InterruptedException {
//    public static void main(String[] args)  throws URISyntaxException, IOException, InterruptedException {
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "8888");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyPort", "8888");
//        System.setProperty("javax.net.ssl.trustStore", "e:\\FiddlerKeystore");
//        System.setProperty("javax.net.ssl.trustStorePassword", "leareai");
//        String name = ManagementFactory.getRuntimeMXBean().getName();
//        log("=== pid:"+name+" =====");
//        String s = SampleConfigurationHelper.getEndpoint();
//        String url = "https://apim-func-test-uscx-s0.cognitiveservices.azure.com/face/v1.1-preview.1/detect";
//        String accountKey = SampleConfigurationHelper.getAccountKey();
//
//        Path path = Path.of(SampleUtils.TEST_IMAGE_PATH_FAMILY1_DAD1);
//        BinaryData data = BinaryData.fromFile(path);
//
//        log("start test");
//        HttpRequest request = HttpRequest.newBuilder()
//            .uri(new URI(url))
//            .setHeader("apim-subscription-id", "lel")
//            .setHeader("Content-Type","application/octet-stream")
//            .setHeader("Ocp-Apim-Subscription-Key",accountKey)
//            .setHeader("client-request-id","test-java-http")
//            .POST(HttpRequest.BodyPublishers.ofFile(
//                    Path.of(SampleUtils.TEST_IMAGE_PATH_FAMILY1_DAD1)))
//            .build();
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        log("result:"+response.body());

        testRemoteRequest();
//        testLocalRequest();
    }


    private static void testRemoteRequest() {
        log("TestRemoteRequest starts");
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();
        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildClient();
//        FaceClient client = createClient(FaceClient.class);


        Path path = FileSystems.getDefault().getPath(Utils.TEST_IMAGE_PATH_FAMILY1_DAD1);
        BinaryData data = BinaryData.fromFile(path);
        List<FaceDetectionResult> results = client.detect(data,
            true,
            null,
            null,
            FaceRecognitionModel.RECOGNITION_04,
            null, FaceDetectionModel.DETECTION_03,
            null);
        log("TestRemoteRequest:" + results.get(0).getFaceId());

        RequestOptions requestOptions = new RequestOptions();
//        requestOptions.setHeader("apim-subscription-id", "lel");
        requestOptions.setHeader("client-request-id", "test-sdk-http");
        requestOptions.setHeader("Content-Type", "application/octet-stream");

        Response<BinaryData> results2 = client.detectWithResponse(data, requestOptions);
        System.out.println("FaceClientTest:" + results2.getValue().toString());
    }
    private static void testLocalRequest() {
        Path path = FileSystems.getDefault().getPath(Utils.TEST_IMAGE_PATH_FAMILY1_DAD1);
        BinaryData data = BinaryData.fromFile(path);

        String endpoint = "http://localhost:8081";
        String accountKey = ConfigurationHelper.getAccountKey();
        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
            .buildClient();

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setHeader("apim-subscription-id", "lel");
        requestOptions.setHeader("Content-Type", "application/octet-stream");

        Response<BinaryData> results = client.detectWithResponse(data, requestOptions);
        System.out.println("FaceClientTest:" + results.getStatusCode());
    }
}
