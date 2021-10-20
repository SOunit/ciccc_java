package y2020.m10.d20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import y2020.utils.UserInput;

public class Lab3Q1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randomNum = random.nextInt(50) + 1;
			list.add(randomNum);
		}

		System.out.println(list);

		UserInput userInput = new UserInput();
		int inputNum = userInput.getNunber();
		System.out.println(inputNum);

		Boolean hasMatch = false;
		for (int i = 0; i < list.size(); i++) {
			if (inputNum == list.get(i)) {
				hasMatch = true;
			}
		}

		if (hasMatch) {
			System.out.println("match");
		} else {
			System.out.println("no match");
		}
	}

}
