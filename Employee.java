/**
 * Class Employee extends the abstract class Person to model an employee
 */
public class Employee extends Person {
    
    // Data members
    private String position;
    private double salary;

    /**
     * Default constructor
     */
    public Employee() {
        super();  // Calls the default constructor of Person
        position = "on leave";  // Sets default value for position
        salary = 0;  // Sets default value for salary
    }

    /**
     * Constructor with seven parameters
     * @param id initial value for the id
     * @param n initial value for the name
     * @param a initial value for the address
     * @param p initial value for the phone number
     * @param e initial value for the email address
     * @param po initial value for the position
     * @param s initial value for the salary
     */
    public Employee(int id, String n, String a, String p, String e, String po, double s) {
        super(id, n, a, p, e);  // Calls the parameterized constructor of Person
        position = po;  // Sets initial value for position
        salary = s;  // Sets initial value for salary
    }

    /**
     * Accessor for the position
     * @return value of the position
     */
    public String getPosition() { 
        return position; 
    }

    /**
     * Accessor for the salary
     * @return value of the salary
     */
    public double getSalary() { 
        return salary; 
    }

    /**
     * Accessor for the Employee attributes, including inherited attributes
     * @return formatted string with the object attributes
     */
    public String toString() {
        return String.format("%sPosition: %s\nSalary: %.2f\n", 
                             super.toString(), position, salary);
    }

    /**
     * Mutator for the position
     * @param s value of the position
     */
    public void setPosition(String s) { 
        position = s; 
    }

    /**
     * Mutator for the salary
     * @param d value of the salary
     */
    public void setSalary(double d) { 
        salary = d; 
    }
}
