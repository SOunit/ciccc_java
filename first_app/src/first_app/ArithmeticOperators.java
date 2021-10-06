package first_app;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2 + 1;
		System.out.println(i);

		String s = "2" + 1;
		System.out.println(s);

		int z = 12 + 1;
		z = 12 - 1;
		z = 12 * 2;
		z = 12 / 2;
		System.out.println(z);

		int mod = 13 % 2;
		System.out.println(mod);

		int increment = 10;
		System.out.println("postfix, " + increment++);
		System.out.println("prefix, " + ++increment);

		System.out.println(-23 - 3);

		// Parentheses
		int pnum = ((4 + 3) + (2 + 7));
		System.out.println("Parentheses, " + pnum);

		int x = 2 * (2 - 3);
		System.out.println("x, " + x);

		double sss = (31.5 - 12) / 4.1;
		System.out.println(sss);

		int iii = (7 / 4);
		System.out.println(iii);

		iii = 1 / 2 + 1 / 2;
		System.out.println(iii);

		iii = 99 / 100;
		System.out.println(iii);

		byte bbb = -128;
		System.out.println(bbb);

		// Q17

		int a = 3;
		float b = 3.0f;
		float value = (a * a) + (2 * (a * b)) + (b * b);
		System.out.println("Value of the equation is " + value);
	}

}
