package y2021.m10.d25;

import java.util.ArrayList;
import java.util.List;

public class NumListModel {
	public List<Integer> numList;
	public int max;
	public List<List<Integer>> resultList;

	public NumListModel() {
		this.initList();

		this.max = 2;
	}

	public void initList() {
		this.numList = new ArrayList<>();
		this.numList.add(1);
		this.numList.add(2);
		this.numList.add(3);
		this.numList.add(4);
		this.numList.add(5);
	}
}
