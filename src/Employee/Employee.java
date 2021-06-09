package Employee;

public class Employee {

    //Fields

    private String fName;
    private String lName;
    private double sal;

    //Constructor

    public Employee(String fName, String lName, double sal){

        this.fName = fName;
        this.lName = lName;
        this.sal = sal < 0 ? 0.0 : sal;

    }

    //Getters & Setters

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //Raise salary

    public void raise(Employee employee, double percentRaise){

        employee.setSal(employee.getSal() + employee.getSal() * percentRaise/100);

    }

    // Override toString()

    public String toString(){
        return "%nFirst Name: " + this.getfName() + "%nLast Name: " + this.getlName() + "%nYearly Salary: " + this.getSal() * 12 + "%n";
    }
}
