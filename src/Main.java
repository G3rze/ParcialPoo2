import TechInnovators.Personal.CEO;
import TechInnovators.Personal.Employee;
import TechInnovators.PrimaryDepartmentFactory;
import TechInnovators.SecondaryDepartmentFactory;

public class Main {

    static PrimaryDepartmentFactory primaryDepartmentFactory = new PrimaryDepartmentFactory();

    static SecondaryDepartmentFactory secondaryDepartmentFactory = new SecondaryDepartmentFactory();

    public static void main(String[] args) {
        Employee employee1 = primaryDepartmentFactory.createEmployee("José");
        Employee employee2 = primaryDepartmentFactory.createEmployee("Juan");
        Employee employee3 = primaryDepartmentFactory.createEmployee("Pedro");
        Employee employee4 = secondaryDepartmentFactory.createEmployee("Ramiro");
        Employee employee5 = secondaryDepartmentFactory.createEmployee("Moises");
        Employee employee6 = secondaryDepartmentFactory.createEmployee("Camilo");

        CEO ceo = new CEO();
        ceo.setName("Pedrito");

        ceo.work();
        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();
        employee5.work();
        employee6.work();
    }
}