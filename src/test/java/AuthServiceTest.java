import static org.junit.jupiter.api.Assertions.assertNotEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ifrs.AuthService;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class AuthServiceTest {

    AuthService service;

    @Inject
    AuthServiceTest(AuthService service){
        this.service = service;
    }

    @Test
    @DisplayName("Teste GenerateToken")
    void testGetToken(){
        assertNotEquals("null", service.getToken("alex", "email"));
    }

    @Test
    @DisplayName("Teste GenerateToken")
    void testGetAdmin(){
        assertNotEquals("null", service.getTokenAdmin("alex", "email"));
    }
    
    @Test
    @DisplayName("Teste GenerateToken")
    void testGetTokenNull(){
        assertNotEquals("null", service.getToken("alex", "email"));
    }
}
