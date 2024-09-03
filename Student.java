/**
 * Class Student extends the abstract class Person to model a student
 */
public class Student extends Person {
    
    // Data member
    private String major;

    /**
     * Default constructor
     */
    public Student() {
        super();  // Calls the default constructor of Person
        major = "undeclared";  // Sets default value for major
    }

    /**
     * Constructor with six parameters
     * @param id initial value for the id
     * @param n initial value for the name
     * @param a initial value for the address
     * @param p initial value for the phone number
     * @param e initial value for the email address
     * @param m initial value for the major
     */
    public Student(int id, String n, String a, String p, String e, String m) {
        super(id, n, a, p, e);  // Calls the parameterized constructor of Person
        major = m;  // Sets initial value for major
    }

    /**
     * Accessor for the major
     * @return value of the major
     */
    public String getMajor() { 
        return major; 
    }

    /**
     * Mutator for the major
     * @param m value of the major
     */
    public void setMajor(String m) { 
        major = m; 
    }

    /**
     * Accessor for the Student attributes, including inherited attributes
     * @return formatted string with the object attributes
     */
    public String toString() {
        return String.format("%sMajor: %s\n", 
                             super.toString(), major);
    }
}
