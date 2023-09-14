package practice;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Josh", "SDET", 100000, 'M'); //default constructor
        System.out.println(employee1);

        Employee employee2 = new Employee("Aigerim", "Manager",300000, 'F' );
        System.out.println(employee2);


    }

}
