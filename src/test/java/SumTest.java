import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SumTest {
    @Test
    public void testSum() {
        Sum sum = new Sum();
        assertEquals(6, sum.sum(3, 3));
    }
}