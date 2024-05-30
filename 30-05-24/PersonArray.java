import java.util.Scanner;

public class PersonArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        scanner.nextLine();

        person[] persons = new person[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            persons[i] = new person(name, age);
        }

        System.out.println("\nDetails of all persons:");
        for (person person : persons) {
            person.printDetails();
        }

        scanner.close();
    }
}
