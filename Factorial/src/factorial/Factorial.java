package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Input: Ask user for the number to calculate its factorial
        System.out.print("Enter a number to calculate its factorial: ");
        int n = reader.nextInt();

        int factorial = 1;

        // Iteratively calculate the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + n + " is " + factorial);
        
        reader.close();
    }
}
