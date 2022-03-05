package com.design.State;

public class NoProfile implements ProfileState {
		
		JobSearch jobSearch;
		
		public NoProfile(JobSearch newJobSearch){
			jobSearch = newJobSearch;
		}

		public void AddProfile() {
			System.out.println("Please select Profile");
			jobSearch.setProfileState(jobSearch.getAcceptedProfileState());
		}

		public void RemoveProfile() {
			System.out.println("Profile didn't have skills");
		}

		public void verifyDetails(int ProfileID) {
			System.out.println("Profile doesn't have skills");
		}

		public void searchProfiles(String skills) {
			System.out.println("No Profile with the required skills");
		}
	}