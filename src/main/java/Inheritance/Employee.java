package Inheritance;

public class Employee { //Superclass or BaseClass

    private String name;
    private int salary;
    private String departman;

    //constructor
    public Employee(String name, int salary, String departman) {

        this.name = name;
        this.salary = salary;
        this.departman = departman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    //Methods
    public void work() {
        System.out.println("Employee is working");
    }

    public void showInfo() {
        System.out.println("Name :" + name);
        System.out.println("Salary :" + salary);
        System.out.println("Departman :" + departman);
    }

    public void changeDepartman(String newDepartman) {
        System.out.println("Departman is changed...");
        this.departman = newDepartman;

        System.out.println("New Departman : " + this.departman);

    }



}
