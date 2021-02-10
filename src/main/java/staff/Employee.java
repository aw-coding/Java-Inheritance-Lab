package staff;

public class Employee {


    private String name;
    private double salary;
    private String NiNumber;


    public Employee(String name, double salary, String NiNumber) {

        this.name = name;
        this.salary = salary;
        this.NiNumber = NiNumber;
    }
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public String getNiNumber() {
        return NiNumber;
    }

    public void raiseSalary(double multiplier) {
        salary = salary * multiplier;

    }
}
