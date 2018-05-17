import com.eliya.harush.exam.biocatch.api.entities.ScoreEntity;
import com.eliya.harush.exam.biocatch.api.entities.ScoreRequestEntity;
import com.eliya.harush.exam.biocatch.api.utilities.ScoreUtils;
import com.jayway.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoreApiTests {

    private ScoreUtils scoreUtils = new ScoreUtils();

    @Test
    public void validResponseTest1(){
        ScoreEntity scoreEntity = scoreUtils.postScore();
    }

    @Test
    public void invalidResponseTest2(){
        ScoreRequestEntity scoreRequestEntity = new ScoreRequestEntity();
        scoreRequestEntity.customerSessionId= "blablablatesting";
        Response response = scoreUtils.postScoreResponse(scoreRequestEntity);
        response.then().assertThat().statusCode(HttpStatus.SC_OK);
        ScoreEntity score = response.as(ScoreEntity.class);
        Assert.assertEquals(score.bcStatus,"client_data_not_collected");
    }

    @Test
    public void validResponseTest3(){
    }



}
