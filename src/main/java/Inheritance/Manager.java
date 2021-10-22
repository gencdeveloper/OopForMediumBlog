package Inheritance;

public class Manager extends Employee {

    private int responsiblePerson; //Additional Item for Manager



    public Manager(String name, int salary, String departman,int responsiblePerson) {
        //I want to use my inherited's constructor.Therefore i code super with paranteshis
        //super()
        super(name, salary, departman);

        this.responsiblePerson = responsiblePerson;

    }

    //Additional method for Manager

    public void increaseSalary(int raiseAmount) {
        System.out.println(raiseAmount + " % raised for employees");
    }

    @Override
    public void showInfo() {
//		System.out.println("Name :" + getName());
//		System.out.println("Salary :" + getSalary());
//		System.out.println("Departman :" + getDepartman());

        //u can call method from sub class to child class with superKeyword
        super.showInfo();

        System.out.println("Responsible Person :" + this.responsiblePerson);
    }

}

