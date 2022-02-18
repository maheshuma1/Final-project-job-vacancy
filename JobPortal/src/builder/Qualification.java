package builder;
import java.util.*;
public class Qualification {
	String name;
	List<String> qualifications;
	public void addQualification(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("*****" + this.name + "*******\n");
		for(String qualification: qualifications) {
			buffer.append(qualification + "\n");
		}
		buffer.append("\n\n");
		return buffer.toString();
	}
}
