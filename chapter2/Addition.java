// Addition program that displays the sum of two numbers.
import java.util.Scanner;  // program uses class Scanner

public class Addition {   // fix typo here
    
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        int number1;  // first number to add
        int number2;  // second number to add
        int sum;      // sum of number1 and number2
        
        System.out.print("Enter first integer: ");  // prompt for input
        number1 = input.nextInt();  // read first number from user
        
        System.out.print("Enter second integer: ");  // prompt for input
        number2 = input.nextInt();  // read second number from user
        
        sum = number1 + number2;  // add numbers, store result in sum
        
        System.out.printf("Sum is %d%n", sum);  // display sum
    }  // end method main
}  // end class Addition
