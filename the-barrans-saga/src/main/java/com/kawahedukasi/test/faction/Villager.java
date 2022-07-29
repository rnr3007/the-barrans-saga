package com.kawahedukasi.test.faction;

import com.kawahedukasi.test.constant.VillagerConstant;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Villager {
    public BigDecimal saveVillageProgram(Map<String, List<Integer>> villagerPair){
        Function<List<Integer>, Integer> bornYearCounter = (x) -> {
            int ageOfDead = x.get(0);
            int yearOfDead = x.get(1);
            return yearOfDead-ageOfDead;
        };

        Integer bornYearOfPersonA = bornYearCounter.apply(
                villagerPair.get(VillagerConstant.VILLAGER_A)
        );

        Integer bornYearOfPersonB = bornYearCounter.apply(
                villagerPair.get(VillagerConstant.VILLAGER_B)
        );

        if (bornYearOfPersonA > -1 & bornYearOfPersonB > -1){
            Witch witch = new Witch();
            BigDecimal killingRuleAtYearA = witch.killingRule(bornYearOfPersonA);
            BigDecimal killingRuleAtYearB = witch.killingRule(bornYearOfPersonB);
            BigDecimal totalKilling = killingRuleAtYearA.add(killingRuleAtYearB);
            BigDecimal killingAverage = totalKilling.divide(BigDecimal.valueOf(2));

            return killingAverage;
        }
        else return BigDecimal.valueOf(-1);
    }
}
