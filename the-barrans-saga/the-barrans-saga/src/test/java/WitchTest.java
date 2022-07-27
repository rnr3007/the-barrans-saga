import com.kawahedukasi.test.Witch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WitchTest {

    @Test
    void testWitchKillRule(){
        Witch witch = new Witch();
        assertEquals(1, witch.killingRule(1));
        assertEquals(2, witch.killingRule(2));
        assertEquals(4, witch.killingRule(3));
        assertEquals(7, witch.killingRule(4));
        assertEquals(12, witch.killingRule(5));
    }
}