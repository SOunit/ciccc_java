package ex20211012.animals;

public class Animal {
	protected int height;
	protected int weight;
	protected String animalType;
	protected String bloodType;

	public Animal() {
		this.height = 10;
		this.weight = 15;
		this.animalType = "animal type default";
		this.bloodType = "blood type default";
	}

	public Animal(int height, int weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	protected void showInfo() {
		System.out.println("===================");
		System.out.println(this.getClass().getName());
		System.out.println("height: " + this.height);
		System.out.println("weight: " + this.weight);
		System.out.println("animalType: " + this.animalType);
		System.out.println("bloodType: " + this.bloodType);
	}
}
