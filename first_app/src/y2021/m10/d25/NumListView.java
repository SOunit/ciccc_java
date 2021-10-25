package y2021.m10.d25;

public class NumListView {
	public void showMenu(NumListModel numListModel) {
		System.out.println("> numList: " + numListModel.numList);
		System.out.println("> max: " + numListModel.max);
		System.out.println("> resultList: " + numListModel.resultList);
		System.out.println("1. update num list");
		System.out.println("2. update max");
		System.out.println("99. quit");
	}

	public void showMenu1() {
		System.out.println("1. update num list!");
	}

	public void showMenu2() {
		System.out.println("2. update max!");
	}

	public void showInputInvalidMessage() {
		System.out.println("input should be 1 or 2!");
	}
}
