package ohtu;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplierTest {

    @Test
    public void kertominenToimii() {
        Multiplier kolme = new Multiplier(3);

        assertEquals(12, kolme.multipliedBy(4));
    }
}
