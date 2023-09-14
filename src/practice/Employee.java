package practice;

public class Employee {

    public String name;
    public String jobTitle;
    public double salary;
    public char gender;

    public Employee(String name, String jobTitle, double
                    salary, char gender){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary=salary;
        this.gender=gender;


    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
