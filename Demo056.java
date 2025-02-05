import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0, digit;
        
        // Process each digit of the number
        while (number > 0) {
            digit = number % 10;  // Extract the last digit
            sum += Math.pow(digit, 3);  // Cube the digit and add to sum
            number /= 10;  // Remove the last digit
        }
        
        // Output the result
        System.out.println("Sum of cubes of digits: " + sum);
        
        scanner.close();
    }
}
