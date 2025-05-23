import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    public void init(){
        Calculatrice calculatrice = new Calculatrice();
    }
    @Test
    public void testAdd() {
        assertEquals(6.0f, calculatrice.add(4.0f, 2.0f));
    }

    @Test
    public void testDiv() {
        assertEquals(3.0f, calculatrice.div(7.0f, 4.0f));
    }

    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculatrice.div(8.0f, 0.0f);
        });
    }

    @Test
    public void testMult() {
        assertEquals(35.0f, calculatrice.mult(5.0f, 7.0f));
    }

    @Test
    public void testMinus() {
        assertEquals(0.5f, calculatrice.minus(2.0f, 1.5f));
        assertEquals(-2.0f, calculatrice.minus(3.0f, 5.0f));
    }
}