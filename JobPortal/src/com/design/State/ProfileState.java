package com.design.State;

public interface ProfileState {
	// Different states expected
	// hasProfile, noProfile, hasProfileID, noSkills
	void AddProfile();
	void RemoveProfile();
	void verifyDetails(int ProfileID);
	void searchProfiles(String skills);
}