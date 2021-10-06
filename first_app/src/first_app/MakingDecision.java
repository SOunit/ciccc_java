package first_app;

public class MakingDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "4";

		if (x == "5") {
			System.out.println("Value is 5");
		} else {
			System.out.println("Value is NOT 5");
		}

		if (x != "5") {
			System.out.println("Value it NOT 5");
		} else {
			System.out.println("Value is 5");
		}

		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1 && bool2) {
			System.out.println("Condition is TRUE");
		} else {
			System.out.println("Condition is FALSE");
		}
	}

}
