import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {
    @Test
    public void simpleEqualTest() {
        assertTrue("1 == 1", Flik.isSameNumber(1, 1));
        assertTrue("1 == 1", Flik.isSameNumber(2, 2));
        assertTrue("1 == 1", Flik.isSameNumber(3, 3));
    }

    @Test
    public void intEqualTest() {
        for (int i = 0; i < 1000; i++) {
            boolean res = Flik.isSameNumber(i, i);
            assertTrue("same int should be equal", res);
        }
    }
}
