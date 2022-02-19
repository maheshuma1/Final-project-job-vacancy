package factory;

import state.Context;
import state.MainMenuState;

public class DefaultMenu implements Menu{

	public void createMenu() {
		Context context = new Context();
		MainMenuState goHome = new MainMenuState();
		goHome.printStatus(context);
	}

}
