package src;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to check string is palindrome or not");
        String name=sc.next();
        String reverse="";
        int length=name.length();

        for (int i =length-1; i >=0 ; i--)
        {
            reverse=reverse+name.charAt(i);
        }
            if (name.equals(reverse))
            {
                System.out.println("String is palindrome");
            }else {
                System.out.println("String is not palindrome");
            }



    }
}
