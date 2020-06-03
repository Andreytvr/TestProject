
import config.TestConfig;
import org.json.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.TestListener;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Listeners({TestListener.class})

public class ApiTest extends TestConfig {


    @Test
    public void createUser(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", "TestUser");
        jsonObj.put("job", "Tester");
        given()
                .contentType("application/json")
                .body(jsonObj.toString())
                .when()
                .post("users")
                .then()
                .assertThat()
                .statusCode(201)
                .body("name",equalTo("TestUser"))
                .body("job",equalTo("Tester"))
                .extract()
                .response();



    }

    @Test
    public void updateUser(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", "UserTest");
        jsonObj.put("job", "QA");
        given()
                .contentType("application/json")
                .body(jsonObj.toString())
                .put("users/" + "2")
                .then()
                .assertThat()
                .statusCode(200)
                .body("name",equalTo("UserTest"))
                .body("job",equalTo("QA"))
                .extract()
                .response();

    }

    @Test
    public void getUser(){
        given()
                .get("users/" + "2")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data.id",equalTo(2))
                .body("data.first_name",equalTo("Janet"))
                .body("data.last_name",equalTo("Weaver"))
                .body("ad.company",equalTo("StatusCode Weekly"))
                .extract()
                .response();

    }

    @Test
    public void deleteUser() {
        given()
                .delete("users/" + "2")
                .then()
                .assertThat()
                .statusCode(204)
                .extract()
                .response();
    }



}
