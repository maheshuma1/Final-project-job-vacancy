package builder;

public class SystemBuilder extends QualificationBuilder{
	public SystemBuilder() {
		this.name = "Qualifications for System Analyst";
	}
	@Override
	public QualificationBuilder addCertifiedWebProfessional() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public QualificationBuilder addCertifiedSoftwareProfessional() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public QualificationBuilder addCertifiedSofwareEngineeringMaster() {
		// TODO Auto-generated method stub
		this.qualifications.add("1. Software Engineering Master Certification (SEMC)");
		return this;
	}

	@Override
	public QualificationBuilder addMicrosoftCertifiedSystems() {
		// TODO Auto-generated method stub
		this.qualifications.add("2. Microsoft Certified Systems Engineer (MCSE)");
		return this;
	}

	@Override
	public QualificationBuilder addComptia() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public QualificationBuilder addVMwareProfessional() {
		// TODO Auto-generated method stub
		return this;
	}

}
