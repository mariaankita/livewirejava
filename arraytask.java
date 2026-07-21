package ppractisetasks;

import java.util.Scanner;

public class arraytask {

	public static void main(String[] args) {
		
		
////3
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("enter arrya size ");
//	    int size=sc.nextInt();
//	    int a[]=new int[size];
//	    System.out.println("enter array elemnts:");
//	    for (int i=0;i<size;i++)
//	    {
//	    	a[i]=sc.nextInt();
//	    }
//	    System.out.println("array elements...");
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	System.out.println(a[i]);
//	    }
//	    
//	    System.out.println("Enter your key to search:");
//	    int key=sc.nextInt();
//	    for (int i=0;i<a.length;i++)
//	    {
//	    	if (a[i]==key)
//	    	{
//	    		System.out.println("key found "+i+" index position");
//	    	}
//	    	
//	    }
//	   
	    
// //4
	    
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("enter arrya size ");
//	    int size=sc.nextInt();
//	    int a[]=new int[size];
//	    System.out.println("enter array elemnts:");
//	    for (int i=0;i<size;i++)
//	    {
//	    	a[i]=sc.nextInt();
//	    }
//	    System.out.println("array elements...");
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	System.out.println(a[i]);
//	    }
//	    
//	    
//	    int max=a[0];
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	if (max<a[i])
//	    	{
//	    		max=a[i];
//	    	}
//	    }
//	    System.out.println("Max element is... "+max);
//	    
//	    int min=a[0];
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	if(min>a[i])
//	    	{
//	    		min=a[i];
//	    	}
//	    }
//	    System.out.println("Min element is... "+min);
	    
	    
////5
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter arrya size ");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("enter array elemnts:");
	    for (int i=0;i<size;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("array elements...");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]<a[j]);
	    		{
	    			int temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	System.out.println(a);
	    	}
	    }
	}
}
	    
	   
	   
