package pl.sda.javastart.Maps;

import java.util.HashMap;

public class Company {

    //Company przechowuje informację w postaci MAP

    private HashMap<String, Employee> employees = new HashMap<>();

    public boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();

        if (employees.get(key) != null) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }
    }

    public Employee getEmployee (String firstName, String lastName){
        String key = firstName + " " + lastName;
        return employees.get(key);
    }
}
