import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    public void testMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(6, multiply.multiply(2, 3));
    }
}