package JobBuilder;

public class portal {
	 
    public static Job searchRequirements(String title) {
 
        JobSearch jobSearch = null;
 
        if (title.equalsIgnoreCase("Application Engineer")) {
        	jobSearch = new appEngineer();
        } else if (title.equalsIgnoreCase("Network Engineer")) {
        	jobSearch = new networkEngineer();
        } else {
            System.out.println("Sorry no requirements are available for " + title);
        }
        return jobSearch.vacencyDetails();
     }
}
