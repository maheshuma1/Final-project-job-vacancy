package com.design.State;

public class HasProfileID implements ProfileState {
	
	JobSearch jobSearch;
	
	public HasProfileID(JobSearch newJobSearch){
		jobSearch = newJobSearch;
	}

	public void AddProfile() {
		System.out.println("Already shortlisted Profile");
	}
	
	@Override
	public void RemoveProfile() {
		System.out.println("Your Profile is removed");
		jobSearch.setProfileState(jobSearch.getRejectedProfileState());		
	}

	public void verifyDetails(int ProfileID) {
		if(ProfileID == jobSearch.id){
			
			System.out.println(ProfileID + " is updated to the system");
			jobSearch.setProfiles(jobSearch.id); 
			
			jobSearch.setProfileState(jobSearch.getAcceptedProfileState());
			
		} else {
			
			System.out.println("Profile don't have the required Skills");
			
			System.out.println("Profile is removed from the list");
			jobSearch.setProfileState(jobSearch.getRejectedProfileState());
			
			if(jobSearch.id != 0){ 
				jobSearch.setProfileState(jobSearch.getRejectedProfileState());
			}
		}
	}
	
	public void searchProfiles(String skills) {
		System.out.println("Quered the required profile already");
	}	
}