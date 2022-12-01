import static org.junit.jupiter.api.Assertions.assertNotEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ifrs.AuthService;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AuthServiceTest {

    AuthService service;

    @Inject
    public AuthServiceTest(AuthService service){
        this.service = service;
    }

    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetToken(){
        assertNotEquals("null", service.getToken("alex", "email"));
    }

    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetAdmin(){
        assertNotEquals("null", service.getTokenAdmin("alex", "email"));
    }
    
    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetTokenNull(){
        assertNotEquals("null", service.getToken("alex", "email"));
    }
}
