package vacancy;
import state.*;
public class JobVacancy {

	public static void main(String[] args) {
		Context context = new Context();

		MainMenuState startUp = new MainMenuState();
		startUp.printStatus(context);

	}

}
