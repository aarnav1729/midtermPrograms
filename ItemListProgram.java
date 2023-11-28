import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ItemListProgram {

    public static void main(String[] args) {
        // Create a Set to store the items
        Set<String> items = new HashSet<>();

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter items
        System.out.println("Enter items (type 'End' to finish):");

        // Loop to continuously get user input until 'End' is entered
        while (true) {
            // Get the user input
            String userInput = scanner.nextLine();

            // Check if the user wants to end input
            if (userInput.equalsIgnoreCase("End")) {
                break;  // Exit the loop if 'End' is entered
            }

            // Add the item to the Set
            items.add(userInput);
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Display the items entered by the user
        System.out.println("Items entered by the user:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}