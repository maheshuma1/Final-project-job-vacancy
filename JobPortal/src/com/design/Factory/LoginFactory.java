package com.design.Factory;

public class LoginFactory {

	public login getInstance(String s) {
		if(s.contains("cand")) {
			return new Candidate();
		}else if(s.contains("recr")){
			return new Recruiter();
		}else {
			return null;
		}
	}
}
