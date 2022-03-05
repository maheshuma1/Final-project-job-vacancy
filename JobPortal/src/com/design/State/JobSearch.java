package com.design.State;

public class JobSearch {
	
	ProfileState hasProfile;     
	ProfileState noProfile;
	ProfileState hasProfileID;
	ProfileState noSkills;
	
	ProfileState profileState;
	
	int id =1234;
	boolean profilematch = false;
	
	public JobSearch(){
		
		hasProfile = new HasProfile(this);
		noProfile = new NoProfile(this);
		hasProfileID = new HasProfileID(this);
		noSkills = new NoSkills(this);
		
		profileState = noProfile;
		
		if(id == 1234){
			profileState = hasProfile;
		}
	}
	
	public void setProfileState(ProfileState newProfileState){
		
		profileState = newProfileState;
		
	}
	
	public void setProfiles(int newProfiles){
		
		id = newProfiles;
		
	}
	
	public void promoteProfile() {
		
		profileState.AddProfile();
		
	}

	public void rejectProfile() {
		
		profileState.RemoveProfile();
		
	}

	public void verifyDetails(int ProfileID) {
		profileState.verifyDetails(ProfileID);
	}

	public void searchProfiles(String skills){
		
		profileState.searchProfiles(skills);
		
	}
	
	public ProfileState getAcceptedProfileState() { return hasProfile; }
	public ProfileState getRejectedProfileState() { return noProfile; }
	public ProfileState getProfileID() { return hasProfileID; }
	public ProfileState getNoSkills() { return noSkills; }
}
