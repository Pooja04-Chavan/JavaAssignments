package Demo;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		//int a[]= {10,20,30,40};
		
		/*int res=0;
		for(int i=0;i<a.length;i++)
		{
		    res=res+a[i];
		    System.out.println(res);
		    
		}*/
		
		// Java program to add two matrices
		
   /*   int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
      int b[][]={ {1,2,3},{4,5,6},{7,8,9}};
      
     int c[][]=new int[3][3];
     
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a.length;j++)
    	 {
    		 c[i][j]=a[i][j]+b[i][j];
    		 System.out.print(c[i][j]);
    		 
    	 }
    	 System.out.println("");
     }*/
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		//to print even number
		/*int i=0;
		while(i<=a.length)
		{
		    System.out.println(i);//2,4,6,8,10
		    i+=2;
		}*/
      
		//to print odd number
		int i=1;
		while(i<=a.length)
		{
		    System.out.println(i);//1,3,5,7,9
		    i+=2;
		}
		
		
		
	}

}
