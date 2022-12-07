import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
@QuarkusTest
class AuthResourceTest {

    
    @Test
    @DisplayName("Primeiro Teste post getjwt")
    void testGetJWT(){

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Segundo Teste post getjwt")
    void testwithClaims(){
        given() 
            .formParam("name", "")
            .formParam("email", "")               
            .when().post("/auth/getjwt")
            .then()
                .statusCode(200);
    }


   
    @Test
    @DisplayName("terceiro Test para ")
    void testGetJWTAdmin(){

        given().formParam("name", "Alexandre")
                .formParam("email", "alex@mail.com")
            .when().post("/auth/getadmin")
            .then()
                .statusCode(200);
        
    }

}
