package common.steps;

import io.restassured.response.Response;
import testUtils.RestAssuredContext;
import utils.TestContext;

public class Base_Steps {
    protected final TestContext testContext;
    protected final RestAssuredContext restAssuredContext;

    public Base_Steps(TestContext testContext, RestAssuredContext restAssuredContext) {
        this.testContext = testContext;
        this.restAssuredContext = restAssuredContext;
    }

    protected void sendGetRequest(String path){
        Response response = restAssuredContext.getRequestSpecification()
                .when()
                .get(path)
                .then().extract().response();
        restAssuredContext.setResponse(response);
    }

    protected void sendPostRequest(String path, String requestBody){
        Response response = restAssuredContext.getRequestSpecification()
                .when()
                .body(requestBody).log().body()
                .post(path)
                .then().extract().response();
        restAssuredContext.setResponse(response);
    }

    protected void sendPutRequest(String path, String requestBody){
        Response response = restAssuredContext.getRequestSpecification()
                .when()
                .body(requestBody).log().body()
                .put(path)
                .then().extract().response();
        restAssuredContext.setResponse(response);
    }

    protected void sendDeleteRequest(String path){
        Response response = restAssuredContext.getRequestSpecification()
                .when()
                .delete(path)
                .then().extract().response();
        restAssuredContext.setResponse(response);
    }
}
