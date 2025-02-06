import java.util.Scanner;

public class Demo58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
