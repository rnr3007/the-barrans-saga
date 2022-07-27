package com.kawahedukasi.test;

public class Witch {
    public Double killingRule(Integer currentYear){
        Double killCount, pastKill, lastYearKill, currentYearKill;
        killCount = 0.0;
        pastKill = 0.0;
        currentYearKill = 1.0;
        lastYearKill = 0.0;

        // Fibonacci counter
        for (Integer yearCounter = 1; yearCounter <= currentYear; yearCounter++){
                killCount = pastKill + currentYearKill;
                pastKill = killCount;
                currentYearKill += lastYearKill;
                lastYearKill = currentYearKill - lastYearKill;
        }

        return killCount;
    }
}
