package Demo;

public class StringAssignment {

	public static void main(String[] args) {
		System.out.println("------------Comparing string-------------");
		
		String s="WELCOME";
		
		System.out.println(s.equals("welcome"));//false
		System.out.println(s.equals("WELCOME"));//true
		System.out.println(s.equalsIgnoreCase("welcome"));//true
		System.out.println(s.equalsIgnoreCase("Welcome"));//true

		
		//concatenate string
		
		System.out.println("-----------Concatenating two string-------------");
	  
		s="Java course";
	  String a="Welcome to";
	  System.out.println(a.concat(s));
	  
	  System.out.println("------------Length of the string-------------");
	  System.out.println(s.length());
	}

}
