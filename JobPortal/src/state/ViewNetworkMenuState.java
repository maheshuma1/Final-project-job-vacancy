package state;
import factory.*;
public class ViewNetworkMenuState implements State {
	public void printStatus(Context context) {
	MenuFactory menuFactory = new MenuFactory();
	menuFactory.createMenu();
	}
}
