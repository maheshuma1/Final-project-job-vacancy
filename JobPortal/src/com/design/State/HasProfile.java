package com.design.State;

public class HasProfile implements ProfileState{
	JobSearch jobSearch;
	
	public HasProfile(JobSearch newJobSearch){
		jobSearch = newJobSearch;
	}

	public void AddProfile() {
		System.out.println("Added Profile choosed to the Short list");
	}

	public void RemoveProfile() {
		System.out.println("Removed Profile from the Short list");
		jobSearch.setProfileState(jobSearch.getNoSkills());
		
	}

	@Override
	public void verifyDetails(int ProfileID) {
		System.out.println("You have not entered correct ProfileID");
	}

	@Override
	public void searchProfiles(String skills) {
		if(skills.equalsIgnoreCase("selenium")){
			
			System.out.println("Profile had required skills");
			jobSearch.profilematch = true;
			jobSearch.setProfileState(jobSearch.getProfileID());
		} else {
			
			System.out.println("Profile doesn't have required skills");
			jobSearch.profilematch = false;
			System.out.println("Removing Profile from the short list");
			jobSearch.setProfileState(jobSearch.getNoSkills());
		}	
	}	
}