package src;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {

        // Sum of Digits: Create a program that calculates the sum of all digits of a given number.
        // For instance, if the input is 123, the output should be 6 (1+2+3).

        //Read or initialize an integer Number.
        //Declare a variable (sum) to store the sum of numbers and initialize it to 0.
        //Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
        //Add the last digit to the variable sum.
        //Divide the number (N) by 10. It removes the last digit of the number.
        //Repeat the above steps (3 to 5) until the number (N) becomes 0.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();

          int sum;
        for ( sum = 0; number!=0 ; number=number/10)
        {
            sum = sum+number%10;

        }
       System.out.println("Sum of Digit is "+sum);

    }
}

