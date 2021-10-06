package first_app;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Java");

		int num = 1;
		int newNum = 3;
		num = newNum;

		System.out.print("num, ");
		System.out.println(num);

		double doubleNum = 10.0 / 6.0;
		System.out.print("doubleNum, ");
		System.out.println(doubleNum);

		boolean flag = true;
		System.out.print("flag, ");
		System.out.println(flag);

		String text = "HELLO";
		System.out.print("text, ");
		System.out.println(text);

		// for git push test
		int iii = 10;
		float fff = 1f;
		float ans = iii % fff;

		byte bbb = 10;
		System.out.println(++bbb);

		int a = 3;
		a = a++;
		System.out.println("1, " + a);

		a = ++a;
		System.out.println("2, " + a);

		a = a--;
		System.out.println("3, " + a);

		a = --a;
		System.out.println("4, " + a);

		float x = 4;
		x *= 5;
		x -= 6;
		x += 1;
		x /= 2;

		System.out.println(x);

	}
}
