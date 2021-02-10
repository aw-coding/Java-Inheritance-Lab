package management;
import staff.Employee;

public class Manager extends Employee {

    private String departmentName;


    public Manager(String name, int salary, String NiNumber, String departmentName) {

        super(name, salary, NiNumber);

        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
