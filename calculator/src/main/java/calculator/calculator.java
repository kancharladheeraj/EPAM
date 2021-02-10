package calculator;
import java.io.*;
import java.util.*;
public class calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("ENTER THE OPERATION");		
		String s=sc.next();
		if(s.charAt(0)=='+')
		{
			
			int c=a+b;
			System.out.println("="+c);
		}
		if(s.charAt(0)=='-')
		{
			
			int c=a-b;
			System.out.println("="+c);
		}
		if(s.charAt(0)=='*')
		{
			
			int c=a*b;
			System.out.println("="+c);
		}
		if(s.charAt(0)=='/')
		{
			
			int c=a/b;
			System.out.println("="+c);
		}
		

	}

}
