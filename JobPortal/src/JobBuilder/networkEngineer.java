package JobBuilder;

public class networkEngineer extends JobSearch {
	Job JobSearch() {
        return new Job();
    }
 
    public void setname() {
        System.out.println("Step : Searching for Application Engineer");
        getJob().setname("Network Engineer");
    }
 
    public void setdescription() {
        System.out.println("Step : Updating Descrition Details");
        getJob().setdescription("Full time employement");
    }
 
    void setSalary() {
        System.out.println("Step : Updating Salary Details");
        getJob().setSalary(50000);
    }
 
    void setLevel() {
    	System.out.println("Step : Updating Qualification");
        getJob().setlevel("Master's");
	}
    
    void setJobType() {
        System.out.println("Network Engineer");
        getJob();
    }
}
