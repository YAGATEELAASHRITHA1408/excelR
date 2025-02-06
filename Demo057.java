import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Extract the last digit
        int lastDigit = num % 10;
        
        // Extract the first digit
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        // Calculate sum
        int sum = firstDigit + lastDigit;
        
        // Display the result
        System.out.println("Sum of first and last digits: " + sum);
        
        scanner.close();
    }
}
