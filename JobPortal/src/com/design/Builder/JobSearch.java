package com.design.Builder;

public abstract class JobSearch {
	private Job job;
	 
    public Job getJob() {
        return job;
    }
 
    public void setjob(Job job) {
        this.job = job;
    }
 
    public final Job vacencyDetails() {
        Job job = JobSearch();
        setjob(job);
        setname();
        setdescription();
        setSalary();
        setLevel();
        return job;
    }
 
    abstract void setname();
 
    abstract void setdescription();
 
    abstract void setSalary();
 
    abstract void setLevel();
 
    abstract Job JobSearch();
}