import java.io.*;
import java.util.Scanner;
class Triangle {
    public static void main(String args[])
    {
	int a,b,c;
	Scanner z = new Scanner(System.in);
    System.out.print("\n\t\tEnter the FIRST side(in cm) : ");
	a = z.nextInt();
	System.out.print("\t\tEnter the SECOND side(in cm): ");
	b = z.nextInt();
	System.out.print("\t\tEnter the THREE side(in cm) : ");
	c = z.nextInt();
	if(a<=0 || b<=0 || c<=0)
	{
		System.out.println("\nNot a triangle");
    	}
	else if(a+b <c || a+c<b || b+c<a)
	{
		System.out.println("\nInvalid input");
		
    	}
	else
	{
		if(a==b && a==c) 
		{
			System.out.println("\nEquilateral Triangle \n");
		}
		else if (a==b || a==c || b==c)
		{
			System.out.println("\nIsoceles Triangle \n");
		}
		else
		{
			System.out.println("\nScalena Triangle \n");
		}
		int s =(a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area = " + area+" cm^2");
		
	}    
    }
}