package ex20211012.animals;

public class Eel extends Fish {
	protected Boolean releaseElec;

	public Eel() {
		super();
		this.releaseElec = true;
	}

	public Eel(Boolean releaseElec) {
		super();
		this.releaseElec = releaseElec;
	}

	protected void showInfo() {
		super.showInfo();
		System.out.println("releaseElec: " + this.releaseElec);
	}
}
