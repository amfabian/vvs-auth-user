import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.security.TestSecurity;

import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.inject.Inject;
import javax.ws.rs.FormParam;

@QuarkusTest
public class AuthResourceTest {

   


    @Test
    @DisplayName("Primeiro Teste post getjwt")
    public void test(){

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Segundo Teste post getjwt")
    public void testwithClaims(){

        

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
    }


   
    @Test
    @DisplayName("First Test")
    public void testSecurityJWT(){

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
        
    }

}
