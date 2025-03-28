package Bonus;

public class Company {
    private Manager manager;
    private String companyName;

    public Company(Manager manager, String companyName){
        this.manager = manager;
        this.companyName = companyName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void printInfo(){
        System.out.println("This is the company \"" + companyName + "\".\n" +
                "Our manager's name is " + manager.getName() + " and they are " + manager.getAge() +
                " years old.");
    }
}
