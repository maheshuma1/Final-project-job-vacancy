package factory;
import java.util.*;
import state.*;
public class MenuFactory {
	public void createMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n============SELECT Option============\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) List Networking Jobs\n"+
		"2) Networking Jobs Qualifications\n"+
		"3) MAIN MENU" );


		int userChoice = input.nextInt();


		if(userChoice ==1) {

			Context context = new Context();
			ViewNetworkMenuState menuState = new ViewNetworkMenuState();
			menuState.printStatus(context);
		}
		if(userChoice ==2) {

			Context context = new Context();
			ViewNetworkMenuState menuState = new ViewNetworkMenuState();
			menuState.printStatus(context);
		}
		else {
			Context context = new Context();
			MainMenuState goHome = new MainMenuState();
			goHome.printStatus(context);
		}




		Context context = new Context();
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.createMenu();
	}
}