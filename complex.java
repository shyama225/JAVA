import java.util.Scanner;

public class complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Add the complex numbers
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;

        // Display the result
        System.out.println("Sum of the complex numbers: " + realSum + " + " + imaginarySum + "i");
    }
}

