package com.kawahedukasi.test.faction;

import java.math.BigDecimal;

public class Witch {
    public BigDecimal killingRule(Integer currentYear){
        BigDecimal killCount = BigDecimal.valueOf(0.0),
                    pastKill = BigDecimal.valueOf(0.0),
                    currentYearKill = BigDecimal.valueOf(1.0),
                    lastYearKill = BigDecimal.valueOf(0.0);

        // Fibonacci counter
        for (Integer yearCounter = 1; yearCounter <= currentYear; yearCounter++){
                killCount = pastKill.add(currentYearKill);
                pastKill = killCount;
                currentYearKill = currentYearKill.add(lastYearKill);
                lastYearKill = currentYearKill.subtract(lastYearKill);
        }

        return killCount;
    }
}
