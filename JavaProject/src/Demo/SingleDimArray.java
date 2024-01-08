package Demo;

public class SingleDimArray {

	public static void main(String[] args) {
		
		//int a[]=new int[5];//declare array with size, starting index is 0 last index is 4
		 
		//storing/inserting value into array
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[]= {100,200,300,400,500};//declare an array without size specifying of an array
		
		System.out.println("Length of an array is "+a.length);//print length/size of an array
		System.out.println(a[2]);//300  //read specific value
		
	/*	for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);//100 200 300 400 500
		}*/
		
		//Enhanced for loop
		
		for(int i:a)
		{
			System.out.println(i);//100 200 300 400 500
		}
	}
}
