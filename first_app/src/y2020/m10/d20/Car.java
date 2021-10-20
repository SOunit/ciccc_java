package y2020.m10.d20;

public class Car {
	public String make;
	public String model;
	public int year;

	public Car(int year) {
		this.model = "default model";
		this.make = "default make";
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

}
