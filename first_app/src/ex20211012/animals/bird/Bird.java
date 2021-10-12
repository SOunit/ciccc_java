package ex20211012.animals.bird;

import ex20211012.animals.Animal;

public class Bird extends Animal {
	Boolean canFly;
	Boolean hasFeathers;

	public Bird() {
		super();
		this.canFly = true;
		this.hasFeathers = true;
	}

	public Bird(Boolean canFly, Boolean hasFeathers) {
		super();
		this.canFly = canFly;
		this.hasFeathers = hasFeathers;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("canFly: " + canFly);
		System.out.println("hasFeathers: " + hasFeathers);
	}
}
