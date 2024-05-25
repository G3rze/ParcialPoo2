package TechInnovators;

import TechInnovators.Personal.Employee;

public class PrimaryDepartmentFactory implements AbstractFactory{
    @Override
    public Employee createEmployee(String nombre) {
        return new Employee(nombre, "Primario");
    }
}
