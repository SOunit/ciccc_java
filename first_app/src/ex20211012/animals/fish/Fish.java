package ex20211012.animals.fish;

import ex20211012.animals.Animal;

public class Fish extends Animal {
	protected String where;
	protected Boolean hasGill;

	public Fish() {
		this.where = "default where";
		this.hasGill = true;
	}

	public Fish(String where, Boolean hasGill) {
		super();
		this.where = where;
		this.hasGill = hasGill;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("where: " + this.where);
		System.out.println("hasGill: " + this.hasGill);
	}
}
