package com.eliya.harush.exam.biocatch.api.utilities;

import com.eliya.harush.exam.biocatch.api.endpoints.BiocatchEndpoints;
import com.eliya.harush.exam.biocatch.api.entities.ScoreEntity;
import com.eliya.harush.exam.biocatch.api.entities.ScoreRequestEntity;
import com.jayway.restassured.response.Response;
import org.apache.http.HttpStatus;

public class ScoreUtils extends BaseUtils {

    public ScoreEntity postScore() {
        Response response = postScoreResponse(new ScoreRequestEntity());
        response.then().assertThat().statusCode(HttpStatus.SC_OK);
        return response.as(ScoreEntity.class);
    }

    public Response postScoreResponse(ScoreRequestEntity request){
        return createBasicRequest()
                .queryParam("customerId", request.customerId)
                .queryParam("action", request.action)
                .queryParam("uuid", request.uuid)
                .queryParam("customerSessionID",request.customerSessionId)
                .post(BiocatchEndpoints.SCORE.uri());
    }
}
