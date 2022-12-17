
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void testSum() {
        Sum sum = new Sum();
        assertEquals(6, sum.sum(3, 3));
    }
}