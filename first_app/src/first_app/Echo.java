package first_app;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inData;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the data");
		inData = scan.nextLine();
		System.out.println("Your input data is...");
		System.out.println(inData);

		scan.close();
	}

}
