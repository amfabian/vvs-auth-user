import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.ws.rs.FormParam;

@QuarkusTest
public class AuthTest {

    @Test
    @DisplayName("First Test")
    public void test(){

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
    }
}
