import java.util.*;

public class SortUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to sort: ");
        int n = scanner.nextInt();  // Get the number of elements to sort

        // Create an array to hold the user input
        String[] inputArray = new String[n];

        // Ask the user to input the elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.next();  // Read each element into the array
        }

        // Sort the array
        Arrays.sort(inputArray);

        // Display the sorted elements
        System.out.println("Sorted elements: ");
        for (String element : inputArray) {
            System.out.println(element);
        }

        scanner.close();  // Close the scanner
    }
}

