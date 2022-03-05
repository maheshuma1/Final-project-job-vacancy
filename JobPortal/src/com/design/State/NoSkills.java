package com.design.State;

public class NoSkills implements ProfileState {
	
	JobSearch jobSearch;
	
	public NoSkills(JobSearch newjobSearch){
		jobSearch = newjobSearch;
	}

	public void AddProfile() {
		System.out.println("Don't have any Profile");
		System.out.println("Profiles are not shortlisted");
	}

	public void RemoveProfile() {
		System.out.println("Don't have any Profile");
		System.out.println("There is no Profile to remove");
	}

	public void verifyDetails(int ProfileID) {
		System.out.println("Don't have any Profile");
	}

	public void searchProfiles(String skills) {
		System.out.println("Don't have any Profile");
	}
}