package com.design.Builder;

public class appEngineer extends JobSearch {
    Job JobSearch() {
        return new Job();
    }
 
    public void setname() {
        System.out.println("Step : Searching for Application Engineer");
        getJob().setname("Application Engineer");
    }
 
    public void setdescription() {
        System.out.println("Step : Updating Descrition Details");
        getJob().setdescription("Full time employement");
    }
 
    void setSalary() {
        System.out.println("Step : Updating Salary Details");
        getJob().setSalary(25000);
    }
 
    void setLevel() {
    	System.out.println("Step : Updating Qualification");
        getJob().setlevel("Graduation");
	}
    
    void setJobType() {
        System.out.println("App Engineer");
        getJob();
    }
}