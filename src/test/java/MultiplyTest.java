import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testMultiply(){
        Multiply multiply =new Multiply() ;
        assertEquals(6,multiply.multiply(2,3));
    }
}