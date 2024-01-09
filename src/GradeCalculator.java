package src;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        // ✅ Grade Calculator:
        // Grade Calculator: Develop a program that calculates grades based
        // on score input.Use conditional statements to assign letter grades
        // (A, B, C, D, F) based on score ranges.*/

        //A: 90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //F:0-49

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Students percentge");

        int score= sc.nextInt();

        if (score >=90 && score <=100)
        {
            System.out.println("A grade");
        }else if (score >=80 && score <=89)
        {
            System.out.println("B grade");
        }else if (score >=70 && score <=79)
        {
            System.out.println("C grade");
        }else if (score >=60 && score <=69)
        {
            System.out.println("D grade");
        }else{
            System.out.println("You are Fail ");
        }


        }
}
