package ConstructorExample;

import java.io.*;

public class TestAddress {

	public static void main(String[] args) {

		Address ad = new Address();
		System.out.println(ad);

		Address ad1 = new Address("Krunal", "New Ranip", 382480);
		System.out.println(ad1);

		String name;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Society Name : ");

		try {
			name = br.readLine();
			ad.setAddress(name);

			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}