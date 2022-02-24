package iterator;
import java.util.*;
import vacancy.*;
public class NetworkMenu {
	List<NetworkingJobs> networkMenu;
	public NetworkMenu() {
		networkMenu = new ArrayList<NetworkingJobs>();
		networkMenu.add(new ApplicationEngineer());
		networkMenu.add(new CyberSecurityAnalyst());
		networkMenu.add(new NetworkAdministrator());
		networkMenu.add(new SystemEngineer());

	}
	public Iterator createIterator() {
		return new NetworkMenuIterator(networkMenu);
	}
}
