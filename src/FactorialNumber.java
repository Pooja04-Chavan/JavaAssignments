package src;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        //Write a program to calculate the factorial of a given number using loops.

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
       int fact=sc.nextInt();

        for (int i=1; i <5 ; i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial  is "+fact);

    }
}
