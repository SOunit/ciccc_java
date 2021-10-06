package first_app;

import java.util.Scanner;

public class EchoSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num, square;

		System.out.println("Enter an integer");

		num = scan.nextInt();
		square = num * num;

		System.out.println("The square of " + num + " is " + square);

		scan.close();
	}

}
