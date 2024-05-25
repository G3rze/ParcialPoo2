package TechInnovators.Personal;

public class Employee extends Personal {

    private String deparment;

    @Override
    public void work() {
        System.out.println("Soy: "+getName()+" y trabajo en el departameneto "+deparment);
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public Employee(String name,String deparment) {
        setName(name);
        this.deparment = deparment;
    }
}
