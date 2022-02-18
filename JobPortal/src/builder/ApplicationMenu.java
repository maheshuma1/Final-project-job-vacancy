package builder;
import java.util.*;
import state.*;
public class ApplicationMenu {
	public void printStatus() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n-------------SELECT QUALIFICATION MENU----------------\n\n"+
				"Enter number associated with your menu selection.\n"+
				"1) Networking Qualifications \n"+
				"2) Web Developer Qualifications \n"+
				"3) System Analyst Qualifications\n"
				+ "4) Main Menu");


		int choice = input.nextInt();


		if(choice ==1) {
			System.out.println("Network Qualifications ");
			NetworkState netState = new NetworkState();

			NetworkBuilder netBuilder = new NetworkBuilder();
			Qualification qualification = netBuilder.addCertifiedSoftwareProfessional()
					.addCertifiedSofwareEngineeringMaster()
					.addCertifiedWebProfessional()
					.addComptia()
					.addMicrosoftCertifiedSystems()
					.addVMwareProfessional().build();
			System.out.println(qualification);


			ApplicationMenu menu = new ApplicationMenu();
			menu.printStatus();



		}
		else if(choice ==2) {
			System.out.println("Web Qualifications ");
			WebState webState = new WebState();
			WebBuilder webBuilder = new WebBuilder();
			Qualification qualification = webBuilder.addCertifiedSoftwareProfessional()
					.addCertifiedSofwareEngineeringMaster()
					.addCertifiedWebProfessional()
					.addComptia()
					.addMicrosoftCertifiedSystems()
					.addVMwareProfessional().build();
			System.out.println(qualification);

			ApplicationMenu menu = new ApplicationMenu();
			menu.printStatus();
			}

		else if(choice ==3) {
			System.out.println("System Analyst Qualifications ");
			SystemState systemState = new SystemState();
			SystemBuilder systemBuilder = new SystemBuilder();

			Qualification qualification = systemBuilder.
					addCertifiedSoftwareProfessional()
					.addCertifiedSofwareEngineeringMaster()
					.addCertifiedWebProfessional()
					.addComptia()
					.addMicrosoftCertifiedSystems()
					.addVMwareProfessional().build();
			System.out.println(qualification);
			ApplicationMenu menu = new ApplicationMenu();
			menu.printStatus();
			}
		else if(choice == 4) {
			Context context = new Context();
			MainMenuState goHome = new MainMenuState();
			goHome.printStatus(context);
		}
		else {

		}
	}

}
