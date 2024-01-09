package src;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        //. Multiplication Table Printer:
        // Write a program that prints the multiplication table of a given
        // number up to a certain range.

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt(); //take input from user
          //int num =5;
          int res;
        for (int i = 1; i <= 10; i++)
        {
             res=num*i;
            System.out.println(num+ "X"+i+ "="+res);
        }


    }
}
