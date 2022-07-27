package com.kawahedukasi.test.faction;

import com.kawahedukasi.test.constant.VillagerConstant;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Villager {
    public Double saveVillageProgram(Map<String, List<Integer>> villagerPair){
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
            Double killingAverage = (
                    (witch.killingRule(bornYearOfPersonA) + witch.killingRule(bornYearOfPersonB)) / 2
            );
            return killingAverage;
        }
        else return -1.0;
    }
}
