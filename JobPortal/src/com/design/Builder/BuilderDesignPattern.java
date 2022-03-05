package com.design.Builder;

public class BuilderDesignPattern {
    public static void builderpattern() {
 
        Job job = portal.searchRequirements("Application Engineer");
        System.out.println(job);
 
        Job job1 = portal.searchRequirements("Network Engineer");
        System.out.println(job1);
    }
}