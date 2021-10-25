package y2021.m10.d20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lab3Q3 {
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			Car car = new Car(random.nextInt(80) + 1);
			carList.add(car);
		}

//		List<Car> sorted = carList.stream().sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList());
//		for (int i = 0; i < sorted.size(); i++) {
//			System.out.println("car year: " + sorted.get(i).year);
//		}

		carList.sort(Comparator.comparing(Car::getYear));
		for (int i = 0; i < carList.size(); i++) {
			System.out.println("car year: " + carList.get(i).year);
		}

	}
}
