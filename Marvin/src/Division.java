import java.util.*;
import java.io.*;

public class Division
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int num1, num2, quotient;
		
		System.out.println("Enter the first number ");
		num1 = input.nextInt();
		System.out.println("Enter the second number ");
		num2 = input.nextInt();
	
		
		try
		{
			quotient = num1/num2;
			System.out.printf("%d", quotient);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inappropriate value entered");
		}
		
		
	}
	
	
	
}
