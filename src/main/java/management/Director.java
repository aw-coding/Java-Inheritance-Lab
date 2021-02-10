package management;
import management.Manager;

public class Director extends Manager {

    private double budget;
    private double salary;

    public Director(String name, int salary, String NiNumber, String departmentName, double budget) {

        super(name, salary, NiNumber, departmentName);

        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }

//    public void payBonus() {
//        salary = salary * 1.02;
//    }

//    public double payBonus(){
//        return this. getSalary() * 0.2;
//    }
}
