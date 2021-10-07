package formatting;

public class MultipleStatements {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		System.out.printf("%d%d%d%n", num1, 20, num2);
		System.out.printf("%d %d %d %n", num1, 20, num2);

		System.out.printf("%d %f %d %n", num1, 20.0, num2);

		int num3 = 11;
		char per = '%';
		String string = "of people are left handed";

		System.out.printf("Did you know, %d%c %s", num3, per, string);
		System.out.printf("%n");
		System.out.printf("Did you know, %d%% %s", num3, string);
		System.out.printf("%n");
	}
}
