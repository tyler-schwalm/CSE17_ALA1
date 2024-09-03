public class Test{
    public static void main(String[] args){

        Person[] people = new Person[3];
        
        people[0] = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", "610-331-7177", "pleister@gmail.com", "CSE");

        people[1] = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", "484-222-4433", "bdown@gmail.com", "System Administrator", 75000.00);

        people[2] = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", "610-333-2211", "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");

        printArray(people);


        System.out.println("Sorted by name");
        selectionSortName(people);
        printArray(people);

        System.out.println("Sorted by ID");
        selectionSortId(people);
        printArray(people);
        
    }

    public static void printArray(Person[] people){
        for(Person person: people){
            System.out.println(person);
        }
    }

    public static void selectionSortName(Person[] people) {
    for (int i = 0; i < people.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < people.length; j++) {
            if (people[j].getName().compareTo(people[minIndex].getName()) < 0) {
                minIndex = j;
            }
        }
        Person temp = people[i];
        people[i] = people[minIndex];
        people[minIndex] = temp;
        }
    }

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