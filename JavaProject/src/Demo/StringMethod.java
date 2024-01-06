package Demo;

public class StringMethod {
	 public static void main(String[]args) {

	String s="Welcome ";
	String s1="To Java";
	
	System.out.println("Length of the string: " + s.length());//returns string length
	
	System.out.println(s.concat(s1));//Joining to string
	
	//trimming string
	s="    Welcome    ";
	System.out.println("Before trimming of string: " + s); 
	System.out.println("After trimming of string: " + s.trim());
			
	//charAt method
	s="Welcome";
	System.out.println(s.charAt(5));//returns character based on index number, index number starts from 0
	
	//contains method-----> returns true otherwise false
	
	s="Welcome";
	System.out.println(s.contains("Wel"));//true
	System.out.println(s.contains("wel"));//false
	System.out.println(s.contains("com"));//true
	
	//Comparing string equals method
	s="Welcome";
	System.out.println(s.equals("Welcome"));//true
	System.out.println(s.equals("welcome"));//false
	System.out.println(s.equals("Wel  come"));//false
	
	System.out.println(s.equalsIgnoreCase("welcome"));//true
	
	//Replacing character
	s="Welcome to Java";
	System.out.println(s.replace('e','i'));
	System.out.println(s.replace("Java","Selenium"));
	
	
	
	
	
	
	
	
}
}