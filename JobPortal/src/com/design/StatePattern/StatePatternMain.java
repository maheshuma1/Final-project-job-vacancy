package com.design.StatePattern;

public class StatePatternMain {
	public static void main(String[] args) {
		StateContext stateContext = new StateContext();
		stateContext.getState();
		stateContext.setState(new Available());
		stateContext.getState();
	}
}