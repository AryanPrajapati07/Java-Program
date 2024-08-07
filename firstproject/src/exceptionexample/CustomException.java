package exceptionexample;

import java.util.*;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Age : ");
			int a = sc.nextInt();
			if (a > 18) {

				System.out.println("You are eligable for registration");
			}

			else {
				throw new Exception();

			}

		} catch (Exception ex) {

			System.out.println("You are not eligable for regstration");
		}
	}

}
