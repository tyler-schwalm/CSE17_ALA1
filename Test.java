/**
 * Class Test contains the main method to demonstrate the functionality of Person, Student, Employee, and Faculty classes.
 */
public class Test {
    
    /**
     * Main method to create and manipulate an array of Person objects
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Array of Person objects, with three different subclasses
        Person[] people = new Person[3];
        
        // Creating and initializing a Student object
        people[0] = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", 
                                "610-331-7177", "pleister@gmail.com", "CSE");

        // Creating and initializing an Employee object
        people[1] = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", 
                                 "484-222-4433", "bdown@gmail.com", "System Administrator", 75000.00);

        // Creating and initializing a Faculty object
        people[2] = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", 
                                "610-333-2211", "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");

        // Print the array of Person objects
        printArray(people);

        // Sort the array by name
        System.out.println("Sorted by name");
        selectionSortName(people);
        printArray(people);

        // Sort the array by ID
        System.out.println("Sorted by ID");
        selectionSortId(people);
        printArray(people);
        
    }

    /**
     * Method to print the attributes of each Person object in the array
     * @param people array of Person objects
     */
    public static void printArray(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    /**
     * Method to sort the array of Person objects by name using selection sort
     * @param people array of Person objects
     */
    public static void selectionSortName(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getName().compareTo(people[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            // Swap the Person objects
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

    /**
     * Method to sort the array of Person objects by ID using selection sort
     * @param people array of Person objects
     */
    public static void selectionSortId(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getID() < people[minIndex].getID()) {
                    minIndex = j;
                }
            }
            // Swap the Person objects
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

}
