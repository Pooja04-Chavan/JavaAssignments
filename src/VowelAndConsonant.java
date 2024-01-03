package src;
import java.util.Scanner;
public class VowelAndConsonant {
    public static void main(String[] args) {


        // Count Vowels and Consonants: Develop a program that counts
        // the number of vowels and consonants in a given string using
        // loops and conditions.


        //String str = sc.next();
       int vCount = 0;
       int cCount = 0;
        String str="Hi im pooja";
        str.toLowerCase();

        for (int i =0; i < str.length() ; i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vCount++;
            }
            else if (str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                cCount++;

            }

        }
        System.out.println("Number of Vowels: "+vCount );
        System.out.println("Number of Consonants: "+cCount );

    }
}
