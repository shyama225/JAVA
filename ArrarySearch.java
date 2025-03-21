import java.util.Scanner;

public class ArrarySearch {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Array of integers (you can modify this with other types if needed)
        int[] numbers = {10, 20, 30, 40, 50};

        // Ask the user to input the element to search for
        System.out.println("Enter the number you want to search for: ");
        int target = scanner.nextInt();

        // Search for the element using linear search
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}

