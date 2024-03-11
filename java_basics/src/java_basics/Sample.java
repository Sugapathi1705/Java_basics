package java_basics;

import java.util.Scanner;

public class Sample
{

	public static void main(String[] args) 
	{
	  Scanner n=new Scanner("System.in");
	  int smaller,a,b;
	  System.out.print("Enter the a value");
	  a=n.nextInt();
	  System.out.print("Enter the b value");
	  b=n.nextInt();
	  smaller=(a<b)? a : b;
	  System.out.println("Smaller= "+smaller);
	}
}
	  
	  
	  
	  
	  
	  