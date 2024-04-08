

import java.util.LinkedList;
import java.util.Scanner;

public class ex2 {
    LinkedList<String> studentNames = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add student names to the list.
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        
        // Displaying the initial list.
        System.out.println("Initial student names list: " + studentNames);

        // Add a student name to the end of the list.
        System.out.println("Enter a new student name to add:");
        String newName = scanner.nextLine();
        studentNames.add(newName);

        // Remove the first occurrence of a specific student name.
        System.out.println("Enter a student name to remove: ");
        String nameToRemove = scanner.nextLine();
        studentNames.remove(nameToRemove);

        // Display the list of student names.
        System.out.println("Updated student names list: " + studentNames);

        // Check if the list contains a specific student name.
        System.out.println("Enter a student name to search: ");
        String nameToSearch = scanner.nextLine();
        boolean contains = studentNames.contains(nameToSearch);
        System.out.println("Contains " + nameToSearch + ": " + contains);
}
