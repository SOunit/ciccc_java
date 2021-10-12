package ex20211012.animals;

public class Crocodile extends Reptile {
	public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String eggType,
			Boolean hasBackbone) {
		super(height, weight, animalType, bloodType, skinType, eggType, hasBackbone);
	}

	protected void showInfo() {
		System.out.println("Crocodile");
		System.out.println("height: " + this.height);
		System.out.println("weight: " + this.weight);
		System.out.println("animalType: " + this.animalType);
		System.out.println("bloodType: " + this.bloodType);
		System.out.println("skinType: " + this.skinType);
		System.out.println("eggType: " + this.eggType);
		System.out.println("hasBackbone: " + this.hasBackbone);
		System.out.println("-------------------");
	}
}
