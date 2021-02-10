package management;
import management.Manager;

public class Director extends Manager {

    private double budget;


    public Director(String name, int salary, String NiNumber, String departmentName, double budget) {

        super(name, salary, NiNumber, departmentName);

        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }
}
