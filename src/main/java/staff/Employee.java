package staff;

public class Employee {


    private String name;
    private int salary;
    private String NiNumber;


    public Employee(String name, int salary, String NiNumber) {

        this.name = name;
        this.salary = salary;
        this.NiNumber = NiNumber;
    }
    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public String getNiNumber() {
        return NiNumber;
    }
}
