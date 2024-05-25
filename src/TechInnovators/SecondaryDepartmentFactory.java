package TechInnovators;

import TechInnovators.Personal.Employee;

public class SecondaryDepartmentFactory implements AbstractFactory{
    @Override
    public Employee createEmployee(String nombre) {
        return new Employee(nombre, "Secundario");
    }
}
