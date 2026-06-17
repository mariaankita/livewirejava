package Demo_task;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
	/*
	 * for loop
	 * for(initialization;condition;inc/dec)
	 * {
	 * 		//block
	 * }
	 * 1.initialization(start)
	 * 2.condition(stop)
	 * 3.block
	 * 4.inc/dec(step)
	 */
		
//		for(int i=1; i<11;i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=10; i>0;i--)
//		{
//			System.out.println(i);
//		}
		
//		int i=1;
//		for(;i<11;)
//		{
//			System.out.println(i);
//		}
		
//		int sum=0;
//		for(int i=1; i<11;i++)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		int a=5;
//		int fact=1;
//		for(int i=1; i<=a;i++)
//		{
//			fact*=i;
//		}
//		System.out.println(fact);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=a;i++)
//		{
//			if(a%i==0)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		if(count==2)
//		{
//			System.out.println("Prime number...");
//		}
//		else
//		{
//			System.out.println("Not Prime number");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int sumeve=0;
//		int sumodd=0;
//		for(int i=1;i<=a;i++)
//		{	
//			if(i%2==0)
//			{
//			 sumeve+=i;	
//			}
//			else
//			{
//				sumodd+=i;
//			}
//		
//		}
//		System.out.println("sum of even num:"+sumeve);
//		System.out.println("sum of odd num:"+sumodd);
//		
		
//		Scanner sc=new Scanner(System.in);
//     	int a=sc.nextInt();
//		System.out.println(a%10);
		
		
//		Scanner sc=new Scanner(System.in);
//     	int a=sc.nextInt();
//		System.out.println(a/10);
		
//		Scanner sc=new Scanner(System.in);
//     	int a=sc.nextInt();
//		System.out.println(a%100);
		
		
		Scanner sc=new Scanner(System.in);
     	System.out.println("Enter a 5 digit number:");
     	int a=sc.nextInt();
     	int i=(a/100);
     	int j=(i%10);
		int square=j*j;
		System.out.println("Square of "+j+" is:"+square);
		
		
	}

}
