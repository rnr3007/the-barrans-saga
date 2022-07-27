import com.kawahedukasi.test.constant.VillagerConstant;
import com.kawahedukasi.test.faction.Villager;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VillagerTest {

    @Test
    void testVillagerProgram(){
        Villager villager = new Villager();
        assertEquals(0.0,
                villager.saveVillageProgram(
                        Map.of(VillagerConstant.VILLAGER_A, Arrays.asList(10,10),
                                VillagerConstant.VILLAGER_B, Arrays.asList(10,10))
                )
        );
        assertEquals(0.5,
                villager.saveVillageProgram(
                        Map.of(VillagerConstant.VILLAGER_A, Arrays.asList(9,10),
                                VillagerConstant.VILLAGER_B, Arrays.asList(10,10))
                )
        );
        assertEquals(-1.0,
                villager.saveVillageProgram(
                        Map.of(VillagerConstant.VILLAGER_A, Arrays.asList(10,9),
                                VillagerConstant.VILLAGER_B, Arrays.asList(10,10))
                )
        );
        assertEquals(4.5,
                villager.saveVillageProgram(
                        Map.of(VillagerConstant.VILLAGER_A, Arrays.asList(10,12),
                                VillagerConstant.VILLAGER_B, Arrays.asList(13,17))
                )
        );
    }
}