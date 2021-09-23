package br.com.worldbank.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WBResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/worldbank/BRA")
          .then()
             .statusCode(200);
    }

}