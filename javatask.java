package task;
import java.util.Scanner;
public class javatask {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter array size:  ");
//	    int size=sc.nextInt();
//	    int a[]=new int[size];
//	    System.out.println("Enter array elements:");
//	    for (int i=0;i<size;i++)
//	    {
//	    	a[i]=sc.nextInt();
//	    }
//	    System.out.println("Array elements: ");
//	    for (int i=0;i<a.length;i++)
//	    {
//	    	 System.out.println(a[i]);
//	    }
//	    
//	    // largest num
//	    int max=a[0];
//	    for (int i=1;i<a.length;i++)
//	    {
//	    	if(max<a[i])
//	    	{
//	    		max=a[i];
//	    	}
//	    }
//	    System.out.println("Largestnumber is..."+max);
//	    // smallest number
//	    int min=a[0];
//	    for (int i=1;i<a.length;i++)
//	    {
//	    	if(min>a[i])
//	    	{
//	    		min=a[i];
//	    	}
//	    }
//	    System.out.println("smallest number is..."+min);
//	    // sum
//	    int sum=0;
//	    for (int i=1;i<a.length;i++)
//	    {
//	    	sum=sum+a[i];
//	    }
//	    System.out.println("sum of elements are..."+sum);
// 
		
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no.of students:  ");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("Enter roll no:");
	    for (int i=0;i<size;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    
	    String N[]=new String[size];
	    System.out.println("Enter NAME:");
	    sc.nextLine();
	    for (int i=0;i<size;i++)
	    {
        
	    	N[i]=sc.nextLine();
	sc.nextLine();
	    	
	    }
	   
//	    int m1[]=new int[size];
//	    System.out.println("Enter marks of subject 1:");
//	    for (int i=0;i<size;i++)
//	    {
//	    	m1[i]=sc.nextInt();
//	    }
//	    
//	    int m2[]=new int[size];
//	    System.out.println("Enter marks of subject 2:");
//	    for (int i=0;i<size;i++)
//	    {
//	    	m2[i]=sc.nextInt();
//	    }
//	    
//	    int m3[]=new int[size];
//	    System.out.println("Enter marks of subject 3");
//	    for (int i=0;i<size;i++)
//	    {
//	    	m3[i]=sc.nextInt();
//	    }
	    
//	    
//	    
	    
	    
//	    for(int i=0;i<size;i++)
//	    {
//	    	int avg=(m1[i]+m2[i]+m3[i])/3;
////	    	
//	    		System.out.println("average of stu " +N[i]+" is "+avg);
////	    	
//	    	if(avg>=85 || avg==100)
//	    	{
//	    		System.out.println("EXECLENT");
//	    	}
//	    	else if(avg>=75 ||  avg==84)
//	    	{
//	    		System.out.println("DISTINCTION");
//	    	}
//	    	else if(avg>=60 || avg==74)
//	    	{
//	    		System.out.println("FRIST CLASS ");
//	    		
//	    	}
//	    	else if(avg>=40 || avg==59)
//	    	{
//	    		System.out.println("PASS");
//	    	}
//	    	else
//	    	{
//	    		System.out.println("POOR");
//	    	}
	    	
//	    }
	   
	    //pinting
//	    System.out.println(" rol Array elements: ");
//	    for (int i=0;i<a.length;i++)
//	    {
//	    	 System.out.println(a[i]);
//	    }
//	    
	    System.out.println("name Array elements: ");
	    for (int i=0;i<N.length;i++)
	    {
	    	 System.out.println(N[i]);
	    }
	   
//	    System.out.println(" m1 Array elements: ");
//	    for (int i=0;i<m1.length;i++)
//	    {
//	    	 System.out.println(m1[i]);
//	    }
//	    
//	    System.out.println(" m2 Array elements: ");
//	    for (int i=0;i<m2.length;i++)
//	    {
//	    	 System.out.println(m2[i]);
//	    }
//	    
//	    System.out.println("m3 Array elements: ");
//	    for (int i=0;i<m3.length;i++)
//	    {
//	    	 System.out.println(m3[i]);
//	    }
	    
	    

	}

}
