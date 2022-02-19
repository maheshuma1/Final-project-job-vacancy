package factory;

import builder.ApplicationMenu;

public class MainMenu implements Menu{

	public void createMenu() {
		ApplicationMenu applicationMenu = new ApplicationMenu();
		applicationMenu.printStatus();
	}
}