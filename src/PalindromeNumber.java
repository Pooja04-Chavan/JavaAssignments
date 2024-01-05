package src;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {

        int res,sum=0,temp;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt(); // take input from user
         temp=n; //stored in temporary variable
        while(n>0)
        {
            res=n%10;
            sum=(sum*10)+res;
            n=n/10;

        }
        if (temp==sum)
        {
            System.out.println(temp+" number is palindrome");
        }else {
            System.out.println(temp+" number is not palindrome");
        }
    }
}
