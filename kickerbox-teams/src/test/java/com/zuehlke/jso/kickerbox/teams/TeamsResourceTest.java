package com.zuehlke.jso.kickerbox.teams;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TeamsResourceTest {

    @Test
    public void testGetTeams() {
        given()
          .when().get("/teams")
          .then()
             .statusCode(200);
    }

}