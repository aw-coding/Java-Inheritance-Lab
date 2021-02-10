package staff;

public abstract class Employee {


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

    public double getSalary() { return salary; }

    public String getNiNumber() {
        return NiNumber;
    }

    public void setName(String newName){
        if(newName != null ){
            name = newName;
        }
    }


    public void raiseSalary(double multiplier) {
        if (multiplier > 1) {
            salary = salary * multiplier;
        }
    }


    public void payBonus(){ 
        salary = salary * 1.01;
    }

}
