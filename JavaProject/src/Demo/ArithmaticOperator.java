package Demo;

public class ArithmaticOperator {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		//Arithmetic Operator
		System.out.println("---------------Arithmatic operators-----------------");
		System.out.println("The Adition of a and b is:" + (a+b));
		System.out.println("The Substrsction of a and b is:" + (a-b));
		System.out.println("The Multiplication of a and b is:" + (a*b));
		System.out.println("The Division of a and b is:" + (a/b));
		System.out.println("The Percentage of a and b is:" + (a%b));
		
		//Relational Operator or Comparison Operator
		
		System.out.println("---------------Relational operators-----------------");
		System.out.println(a==b); //False
		System.out.println(a<b); //True
		System.out.println(a>b); //False
		System.out.println(a<=b); //True
		System.out.println(a>=b); //False
		System.out.println(a!=b);//True
		
		//Logical operator
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("---------------Logical operators-----------------");
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true

		//Incremental operator
		System.out.println("---------------Incremental operators-----------------");
		a =10;
		a++;
		System.out.println(a);
		 b=20;
		b--;
		System.out.println(b);

	}

}
