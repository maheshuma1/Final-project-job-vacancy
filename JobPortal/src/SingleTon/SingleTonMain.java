package SingleTon;

import Factory.LoginFactory;
import Factory.login;

public class SingleTonMain {

	public static void main(String[] args) {
		Login l = Login.getFactoryLogin();
	}
}

class Login{
	 static Login l = new Login();
	 private Login() {
	 }
	 public static Login getFactoryLogin() {
		 LoginFactory lf = new LoginFactory();
		 login login = lf.getInstance("cand");
		 login.Type();
		 return l;
	 }
}