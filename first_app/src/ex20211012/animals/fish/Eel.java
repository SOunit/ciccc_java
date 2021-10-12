package ex20211012.animals.fish;

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

	public void showInfo() {
		super.showInfo();
		System.out.println("releaseElec: " + this.releaseElec);
	}
}
