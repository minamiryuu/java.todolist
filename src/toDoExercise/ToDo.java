package toDoExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToDo {
	
	//private HashMap<Integer, ArrayList>tasks = new HashMap<>();
	
	private List<ToDoItem>items;
	
	public ToDo() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(String title, int importance) {
		ToDoItem item = new ToDoItem(title, importance);
		items.add(item);
	}
	
	public void changetitle(int changeNum1, String changetitle) {
		items.get(changeNum1).settitle(changetitle);
	}
	
	public void changeImp(int changeNum2, int importance1) {
		items.get(changeNum2).setimportance(importance1);
	}
	
	public void changestatus(int changeNum3, String changestatus) {
		items.get(changeNum3).setstatus(changestatus);
	}
	
	public void deleteItem(int deleteNum) {
		items.remove(deleteNum);
	}
	
	public void sortItem() {
		for (int i = 0; i < items.size() - 1; i++) {
			for (int j = i + 1; j < items.size(); j++) {
				if (items.get(i).getimportance() < items.get(j).getimportance()) {
					Collections.swap(items, i, j);
				}
			}
		}
	}
	
	public void showItem() {
		for(int i = 0; i < items.size(); i++) {
			System.out.println(i + "・・・" + items.get(i).gettitle()
				+ "/重要度：" + items.get(i).getimportance()
				+ "/ステータス：" + items.get(i).getstatus());
		}
	}
	
	public int Num() {
		return items.size();
	}
	
}
