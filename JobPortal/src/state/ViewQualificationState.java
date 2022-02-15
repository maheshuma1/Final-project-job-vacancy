package state;
import factory.*;
public class ViewQualificationState implements State {

	@Override
	public void printStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.createMenu();

	}

}
