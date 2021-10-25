package y2021.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	Scanner scan;

	public int getNumber() {
		String inData;
		this.scan = new Scanner(System.in);

		System.out.println("Enter number");
		inData = this.scan.nextLine();

		int data = 0;
		try {
			data = Integer.parseInt(inData);

		} catch (Exception e) {
			System.out.println("Input data is not number!");
			System.out.println("return default number 0!");
		}

		return data;

	}

	public List<Integer> getNumList() {
		// create list
		List<Integer> numList = new ArrayList<>();

		// get user input
		String inData;
		this.scan = new Scanner(System.in);

		boolean keep = true;
		while (keep == true) {
			System.out.println("Enter number");
			System.out.println("q for quit");
			inData = this.scan.nextLine();

			if (inData.equals("q")) {
				keep = false;
				break;
			}

			try {
				int data = Integer.parseInt(inData);
				numList.add(data);

			} catch (Exception e) {
				System.out.println("Input data is not number!");
				System.out.println("return default number 0!");
				numList.add(0);
			}
		}

		return numList;
	}

	public void closeScan() {
		this.scan.close();
	}
}
