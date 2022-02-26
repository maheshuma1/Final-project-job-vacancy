package com.design.StatePattern;

public class StateContext {
	private ProfileState currentState;

	public StateContext() {
		currentState = new Blocked();
	}

	public void setState(ProfileState state) {
		currentState = state;
		System.out.println("\n"+"Profile State Changed"+"\n");
	}

	public void getState() {
		currentState.alert(this);
	}
}
