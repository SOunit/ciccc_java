package y2021.m10.d25;

import java.util.ArrayList;
import java.util.List;

public class NumListLogic {
	public List<List<Integer>> getList(NumListModel numListModel) {
		List<List<Integer>> resultList = new ArrayList<>();

		for (int i = 0; i < numListModel.numList.size(); i++) {

			boolean isResultListExists = resultList.size() != 0;
			boolean isChildListExists = false;
			if (isResultListExists) {
				isChildListExists = resultList.get(resultList.size() - 1).size() >= 0;
			}
			boolean isChildListSizeLessThanMax = false;
			if (isChildListExists) {
				isChildListSizeLessThanMax = resultList.get(resultList.size() - 1).size() < numListModel.max;
			}

			if (isResultListExists && isChildListExists && isChildListSizeLessThanMax) {
				// update existing array
				resultList.get(resultList.size() - 1).add(numListModel.numList.get(i));
			} else {
				// create new array
				List<Integer> newList = new ArrayList<>();
				newList.add(numListModel.numList.get(i));
				resultList.add(newList);
			}
		}

		return resultList;
	}
}
