package wedge;

import java.util.Scanner;

public class Wedge {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			System.out.println("Enter line number");
			Scanner scan = new Scanner(System.in);
			int inData = scan.nextInt();

			drawEdge(inData);

			scan.close();
		} catch (Exception err) {
			System.out.println(err);
			drawEdge(5);
		}

	}

	private static void drawEdge(int line) {
		for (int j = 0; j < line; j++) {
			for (int i = 0; i < line - j; i++) {
				System.out.print("@");
			}
			System.out.println("");
		}
	}

}
