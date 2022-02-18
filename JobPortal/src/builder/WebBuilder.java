package builder;

public class WebBuilder extends QualificationBuilder{

	public WebBuilder() {
		this.name = "Qualifications for Web developer";
	}
	@Override
	public QualificationBuilder addCertifiedWebProfessional() {
		// TODO Auto-generated method stub
		this.qualifications.add("1. Certified Web Professional");
		return this;
	}

	@Override
	public QualificationBuilder addCertifiedSoftwareProfessional() {
		// TODO Auto-generated method stub
		this.qualifications.add("2. Certified Software Development Professional ");
		return this;
	}

	@Override
	public QualificationBuilder addCertifiedSofwareEngineeringMaster() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public QualificationBuilder addMicrosoftCertifiedSystems() {
		// TODO Auto-generated method stub
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
