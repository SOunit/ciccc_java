package y2020.utils;

import java.util.Scanner;

public class UserInput {
	public int getNunber() {
		String inData;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number");
		inData = scan.nextLine();

		try {
			int data = Integer.parseInt(inData);
			return data;
		} catch (Exception e) {
			System.out.println("Input data is not number!");
			System.out.println("return default number 0!");
			return 0;
		}

	}
}
