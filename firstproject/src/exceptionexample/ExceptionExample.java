package exceptionexample;

import java.util.*;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a,b,c;
//		try {
//			
//
//			a=4;
//			b=2;
//			c=a/b;
//			
//			System.out.println(c);
//			
//		}
//		catch(ArithmeticException ar) {
//			System.out.println("You can not divide" + ar.getMessage());
//
//		}
//		catch(Exception e1)
//		{
//			System.out.println("You can not divide" + e1.getMessage());
//		}

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Number : ");
			int a = sc.nextInt();
			System.out.println("Enter second Number : ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
