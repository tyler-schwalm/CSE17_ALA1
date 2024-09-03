/**
 * Class Faculty extends Employee to model a faculty member
 */
public class Faculty extends Employee {
    
    // Data member
    private String rank;

    /**
     * Default constructor
     */
    public Faculty() {
        super();  // Calls the default constructor of Employee
        rank = "none";  // Sets default value for rank
    }

    /**
     * Constructor with eight parameters
     * @param id initial value for the id
     * @param n initial value for the name
     * @param a initial value for the address
     * @param p initial value for the phone number
     * @param e initial value for the email address
     * @param po initial value for the position
     * @param s initial value for the salary
     * @param ra initial value for the rank
     */
    public Faculty(int id, String n, String a, String p, String e, String po, double s, String ra) {
        super(id, n, a, p, e, po, s);  // Calls the parameterized constructor of Employee
        rank = ra;  // Sets initial value for rank
    }

    /**
     * Accessor for the rank
     * @return value of the rank
     */
    public String getRank() { 
        return rank; 
    }

    /**
     * Accessor for the Faculty attributes, including inherited attributes
     * @return formatted string with the object attributes
     */
    public String toString() {
        return String.format("%sRank: %s\n\n", 
                             super.toString(), rank);
    }

    /**
     * Mutator for the rank
     * @param s value of the rank
     */
    public void setRank(String s) { 
        rank = s; 
    }
}
