package com.design.Builder;

public class Job {
	private String name;
    private String description;
    private double salary;
    private String level;
 
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
 
    public String description() {
        return description;
    }
 
    public void setdescription(String description) {
        this.description = description;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double Salary) {
        this.salary = Salary;
    }
 
    public String getlevel() {
        return level;
    }
 
    public void setlevel(String level) {
        this.level= level;
    }
 
    public String toString() {
        return "JobTitle : " + name + ", Description : "+ description+ ", Salary : "+salary+ ", Level : "+level;
    }
}
