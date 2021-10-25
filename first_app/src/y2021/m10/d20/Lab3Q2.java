package y2021.m10.d20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab3Q2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randomNum = random.nextInt(50) + 1;
			list.add(randomNum);
		}

		List<Integer> newList = new ArrayList<>(list);
		int lastIndex = newList.size() - 1;
		newList.set(lastIndex, -5);

		System.out.println("Q2---------------");
		System.out.println(list);
		System.out.println(newList);
	}

}
