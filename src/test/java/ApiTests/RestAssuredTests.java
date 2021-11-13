package ApiTests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
@Log4j2

public class RestAssuredTests {

    public static String readFileAsString(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get("src/test/java/ApiTests/requests/" + fileName + ".json")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    Gson gson = new Gson();
    String token;

    @Test(priority = 1)
    public void loginUser() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/user.api/login";
        String requestBody = readFileAsString("getToken");

        String response = given().header("Content-Type", "application/json")
                .and().body(requestBody)
                .and().post(endpoint)
                .getBody().asPrettyString();

        JsonObject jsonObject = gson.fromJson(response, JsonObject.class);
        token = jsonObject.get("access_token").getAsString();
        log.info("Bearer " + token);

    }
    @Test(priority = 2)
    public void getLoggedUserInfo() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/user.api/me";

        Response response = given().header("Authorization", "Bearer " + token)
                .get(endpoint)
                .then().extract().response();

        JsonObject jsonObject = gson.fromJson(response.asPrettyString(), JsonObject.class);
        Assert.assertEquals(response.statusCode(), 200);


        log.info("Email пользователя =  " + jsonObject.get("email"));

    }
    @Test(priority = 2)
    public void currencyFromUSDtoBYN() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/kurs/api/bestrate?currency=USD&type=nbrb";

        Response response = given().header("Authorization", "Bearer " + token)
                             .get(endpoint)
                             .then().extract().response();

        JsonObject jsonObject = gson.fromJson(response.asPrettyString(), JsonObject.class);
        Assert.assertEquals(response.statusCode(), 200);
        log.info("1$ = " + jsonObject.get("amount") + " BYN");
        log.info("Status Code is " + response.statusCode() + " OK");

    }
    @Test(priority = 2)
    public void currencyFromEURtoBYN() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/kurs/api/bestrate?currency=EUR&type=nbrb";

        Response response = given().header("Authorization", "Bearer " + token)
                .get(endpoint)
                .then().extract().response();

        JsonObject jsonObject = gson.fromJson(response.asPrettyString(), JsonObject.class);
        Assert.assertEquals(response.statusCode(), 200);
        log.info("1€ = " + jsonObject.get("amount") + " BYN");
        log.info("Status Code is " + response.statusCode() + " OK");

    }
    @Test(priority = 2)
    public void getWeather() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/pogoda/api/forecast";

        Response response = given().header("Authorization", "Bearer " + token)
                .get(endpoint)
                .then().extract().response();

        JsonObject jsonObject = gson.fromJson(response.asPrettyString(), JsonObject.class);
        Assert.assertEquals(response.statusCode(), 200);


        log.info("Сейчас в " + jsonObject.get("city") + " " + jsonObject.getAsJsonObject("now").get("phenomena")
                + "; температура воздуха = " + jsonObject.getAsJsonObject("now").get("temperature") + " градуса");

    }
    @Test(priority = 3)
    public void logoutUser() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/user.api/logout";
        String requestBody = readFileAsString("getToken");

        Response response = given().header("Content-Type", "application/json")
                .and().body(requestBody)
                .and().post(endpoint);

        Assert.assertEquals(response.statusCode(), 200);
        log.info("User is deleted");

    }
    @Test(priority = 4)
    public void checkUserIsLogedOut() {

        baseURI = "https://www.onliner.by";
        String endpoint = "/sdapi/user.api/me";

        Response response = given().header("Authorization", "Bearer " + token)
                .get(endpoint)
                .then().extract().response();

        JsonObject jsonObject = gson.fromJson(response.asPrettyString(), JsonObject.class);
        Assert.assertEquals(response.statusCode(), 401);

        log.info("Status Code is " + response.statusCode() + " Unauthorized");
        Assert.assertEquals(jsonObject.get("message"), "Bad Credentials");

    }

}
