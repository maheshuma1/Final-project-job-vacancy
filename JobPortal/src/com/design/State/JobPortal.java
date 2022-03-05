package com.design.State;

public class JobPortal {
	
	public static void main(){
		
		JobSearch jobsearch = new JobSearch();
		
		
		jobsearch.searchProfiles("selenium");
		
		jobsearch.verifyDetails(1234);
		
		jobsearch.promoteProfile();
		
		jobsearch.searchProfiles("Java");
		
		jobsearch.rejectProfile();
	}	
}