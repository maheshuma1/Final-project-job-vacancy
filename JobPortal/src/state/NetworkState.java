package state;

import factory.MenuFactory;

public class NetworkState implements State {

	@Override
	public void printStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.createMenu();

	}
	public String toString() {
		return "Network ";
	}

}
