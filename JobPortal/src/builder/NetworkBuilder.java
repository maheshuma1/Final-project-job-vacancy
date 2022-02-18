package builder;

public class NetworkBuilder extends QualificationBuilder{
	public NetworkBuilder() {
		this.name = "Qualifications for Network Engineer";
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
		this.qualifications.add("1. CompTIA Network+ Certification");
		return this;
	}

	@Override
	public QualificationBuilder addVMwareProfessional() {
		// TODO Auto-generated method stub
		this.qualifications.add("2. VMware Certified Professional – Network Virtualization");
		return this;
	}

}
