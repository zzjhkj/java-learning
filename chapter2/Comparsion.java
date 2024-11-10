
import java.util.Scanner;

// Fig 2.15: Comparsion.java
// Comparsion integers using if statements, relational operators. 
public class Comparsion {
    public static void main(String[] args) {
        //create Scanner to obtain input from command line 
        Scanner input = new Scanner(System.in);

        int number1; //first number to compare 
        int number2; // second number to compare 

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); //read the first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read the second number from user

        if (number1 == number2)
            System.out.printf("%d == %d\n",number1,number2);
    }
}
