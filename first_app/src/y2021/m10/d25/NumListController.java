package y2021.m10.d25;

import y2021.utils.UserInput;

public class NumListController {
	public void start() {

		NumListModel numListModel = new NumListModel();
		NumListView numListView = new NumListView();
		NumListLogic numListLogic = new NumListLogic();

		boolean keep = true;
		UserInput userInput = new UserInput();

		// main loop
		while (keep) {
			System.out.println("------------------------");

			numListModel.resultList = numListLogic.getList(numListModel);
			numListView.showMenu(numListModel);
			int inputNum = userInput.getNumber();

			if (inputNum == 1) {
				numListView.showMenu1();
				numListModel.numList = userInput.getNumList();
				if (numListModel.numList.size() == 0) {
					numListModel.initList();
				}
			} else if (inputNum == 2) {
				numListView.showMenu2();
				numListModel.max = userInput.getNumber();
				if (numListModel.max <= 0) {
					numListModel.max = 1;
				}
			} else if (inputNum == 99) {
				keep = false;
				System.out.println("quit game, bye!");
			} else {
				numListView.showInputInvalidMessage();
			}

		}
	}
}
