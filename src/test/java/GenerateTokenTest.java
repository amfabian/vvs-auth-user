import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ifrs.GenerateToken;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GenerateTokenTest {

    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetToken(){
        GenerateToken gen = new GenerateToken();
        
        assertNotEquals("null", gen.getToken("alex", "email"));
    }

    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetAdmin(){
        GenerateToken gen = new GenerateToken();
        
        assertNotEquals("null", gen.getTokenAdmin("alex", "email"));
    }
    
    @Test
    @DisplayName("Teste GenerateToken")
    public void testGetTokenNull(){
        GenerateToken gen = new GenerateToken();
        assertNotEquals("null", gen.getToken("alex", "email"));
    }
}
