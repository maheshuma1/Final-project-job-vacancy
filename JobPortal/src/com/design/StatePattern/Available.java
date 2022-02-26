package com.design.StatePattern;

public class Available implements ProfileState{
	
	@Override
	public void alert(StateContext cntx) {
		 System.out.println("Profile is available for vacencies");
	}
}