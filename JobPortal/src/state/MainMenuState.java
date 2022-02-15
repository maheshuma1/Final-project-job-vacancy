package state;
import java.util.Scanner;
public class MainMenuState implements State{

	@Override
	public void printStatus(Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n=========Job Vacancy Board==========\n"
				+ "1) View Jobs and Qualifications\n"
				+ "2) Log out\n");
		int choice = input.nextInt();

		switch(choice) {
		case 1:
			ViewNetworkMenuState networkState = new ViewNetworkMenuState();
			networkState.printStatus(context);
			break;
		case 2:
			System.exit(0);

		}

	}

}
