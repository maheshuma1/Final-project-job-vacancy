package com.design.SingleTon;

import com.design.Factory.LoginFactory;
import com.design.Factory.login;

public class SingleTonMain {

	public static void main() {
		Login l = Login.getFactoryLogin();
	}
}

class Login{
	 static Login l = new Login();
	 private Login() {
	 }
	 public static Login getFactoryLogin() {
		 LoginFactory lf = new LoginFactory();
		 login login = lf.getInstance("recr");
		 login.Type();
		 return l;
	 }
}