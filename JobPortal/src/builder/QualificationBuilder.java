package builder;
import java.util.*;
public abstract class QualificationBuilder {
	String name;
	List<String> qualifications = new ArrayList<String>();
	//webdeveloper
	public abstract QualificationBuilder addCertifiedWebProfessional();
	public abstract QualificationBuilder addCertifiedSoftwareProfessional();
	//system analyst
	public abstract QualificationBuilder addCertifiedSofwareEngineeringMaster();
	public abstract QualificationBuilder addMicrosoftCertifiedSystems();
	//network engineer

	public abstract QualificationBuilder addComptia();
	public abstract QualificationBuilder addVMwareProfessional();



	public Qualification build() {
		Qualification  qualification = new Qualification();
		qualification.setName(this.name);
		qualification.addQualification(qualifications);
		return qualification;
	}
}
