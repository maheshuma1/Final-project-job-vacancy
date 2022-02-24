package iterator;

import vacancy.Job;
import java.util.*;
import vacancy.NetworkingJobs;
public class NetworkMenuIterator implements Iterator{
	List<NetworkingJobs> jobsMenu;
	int position = 0;
	public NetworkMenuIterator(List<NetworkingJobs> jobsMenu) {
		this.jobsMenu = jobsMenu;
	}
	@Override
	public Job next() {
		NetworkingJobs job = jobsMenu.get(position);
		position = position + 1;
		return job;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= jobsMenu.size()) {
			return false;
		}
		else
			return true;
	}

}
