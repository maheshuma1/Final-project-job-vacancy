package factory;
import java.util.*;
import builder.*;
import state.*;
public class MenuFactory {
	public void createMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n============SELECT Option============\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Default Menu\n"+
		"2) Networking Menu \n"+
		"3) MAIN MENU" );

		int userChoice = input.nextInt();

		if(userChoice ==1) {
			Menu m = new DefaultMenu();
			m.createMenu();
		}
		if(userChoice ==2) {
			Menu m = new NetworkMenu();
			m.createMenu();
		}
		else {
			Menu m = new MainMenu();
			m.createMenu();
		}
	}
}