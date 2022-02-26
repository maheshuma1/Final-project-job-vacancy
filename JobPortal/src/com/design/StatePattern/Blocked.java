package com.design.StatePattern;

public class Blocked implements ProfileState{
	
	@Override
	public void alert(StateContext cntx) {
		 System.out.println("Profile is blocked with another recruiter or vacencies");
	}
}