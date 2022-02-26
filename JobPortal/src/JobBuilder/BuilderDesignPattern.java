package JobBuilder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
 
        Job job = portal.searchRequirements("Application Engineer");
        System.out.println(job);
 
        Job job1 = portal.searchRequirements("Network Engineer");
        System.out.println(job1);
    }
}