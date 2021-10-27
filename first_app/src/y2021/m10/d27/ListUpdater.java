package y2021.m10.d27;

import java.util.ArrayList;
import java.util.List;

public class ListUpdater {
	public void execute() {
		List<Integer> list = new ArrayList<>();

		System.out.println("initial data");
		System.out.println(list);
		initList(list);
		System.out.println(list);

		getValueFromList(list);
	}

	public void initList(List<Integer> list) {
		System.out.println("create data");
		list.add(1);
		list.add(2);
		list.add(3);
	}

	public void getValueFromList(List<Integer> list) {
		System.out.println("get data");
		System.out.println(list.get(0));
	}
}
