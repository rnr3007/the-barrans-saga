package com.kawahedukasi.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Insert the villager data here
        System.out.println("\n\n;; Villager A ;;");
        System.out.print("Enter the year of death, [enter]: ");
        Integer yearOfDeathVillagerA = scanner.nextInt();
        System.out.print("Enter the age of death [enter]: ");
        Integer ageOfDeathVillagerA = scanner.nextInt();

        System.out.println("\n\n;; Villager B ;;");
        System.out.print("Enter the year of death, [enter]: ");
        Integer yearOfDeathVillagerB = scanner.nextInt();
        System.out.print("Enter the age of death [enter]: ");
        Integer ageOfDeathVillagerB = scanner.nextInt();

        Map<String, List<Integer>> villagerPair = villagerDataWrapper(
                yearOfDeathVillagerA, ageOfDeathVillagerA, yearOfDeathVillagerB, ageOfDeathVillagerB
        );

        Villager villager = new Villager();
        Double killAverage = villager.saveVillageProgram(villagerPair);
        System.out.println("\n\nKill average = " + killAverage);
    }

    // This method used to wrap the given data into Map before passed into the save village program
    public static Map<String, List<Integer>> villagerDataWrapper(
            int yearOfDeathVillagerA, int ageOfDeathVillagerA,
            int yearOfDeathVillagerB, int ageOfDeathVillagerB){

        Map<String, List<Integer>> villagerPair = new HashMap<>();

        List<Integer> deathDataA = new ArrayList<>();
        deathDataA.add(ageOfDeathVillagerA);
        deathDataA.add(yearOfDeathVillagerA);

        List<Integer> deathDataB = new ArrayList<>();
        deathDataB.add(ageOfDeathVillagerB);
        deathDataB.add(yearOfDeathVillagerB);

        villagerPair.put(Constant.VILLAGER_A, deathDataA);
        villagerPair.put(Constant.VILLAGER_B, deathDataB);

        return villagerPair;
    }
}
