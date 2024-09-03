public class Employee extends Person {
    
    private String position;
    private double salary;

    public Employee() {
        super();
        position = "on leave";
        salary = 0;
    }

    public Employee(int id, String n, String a, String p, String e, String po, double s) {
        super(id, n, a, p, e);
        position = po;
        salary = s;
    }

    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public String toString() {
        return String.format("%sPosition: %s\nSalary: %.2f\n", super.toString(), position, salary);
    }

    public void setPosition(String s) { position = s; }
    public void setSalary(double d) { salary = d; }
}
