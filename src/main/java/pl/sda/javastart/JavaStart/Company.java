package pl.sda.javastart.JavaStart;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Natalia", "Siwiec", 5200);
        employees[1] = new Employee("Adam", "Rudnicki", 1200);
        employees[2] = new Employee("Marcin", "Kierzkowski", 22000);
        int employeeIndex = 3;
        System.out.println(employees[employeeIndex-1].getFirstName() + " "
                + employees[employeeIndex-1].getLastName() + " " + employees[employeeIndex-1].getSalary() + "zł" );

        int employeeSize = employees.length;
        System.out.println("Wielkość tablicy to " + employeeSize);

    }

}
