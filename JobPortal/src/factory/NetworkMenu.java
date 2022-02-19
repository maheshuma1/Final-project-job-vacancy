package factory;

import state.Context;
import state.ViewNetworkMenuState;

public class NetworkMenu implements Menu{

	public void createMenu() {
		Context context = new Context();
		ViewNetworkMenuState menuState = new ViewNetworkMenuState();
		menuState.printStatus(context);
	}
}
