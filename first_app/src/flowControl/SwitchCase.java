package flowControl;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "John";

		switch (name.toLowerCase()) {
		case "eric":
			System.out.println("Eric");
			break;
		case "derrick":
			System.out.println("Derrick");
			break;
		case "john":
			System.out.println("John");
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
	}

}
