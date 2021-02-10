package techStaff;


public class Developer {

    private String name;
    private int salary;
    private String NiNumber;

//

    public Developer(String name, int salary, String NiNumber) {

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

