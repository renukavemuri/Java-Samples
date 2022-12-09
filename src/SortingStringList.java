import java.util.ArrayList;
import java.util.Collections;

public class SortingStringList {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Grapes");
		fruitList.add("Blue Berry");
		fruitList.add("pine apple");
		fruitList.add("Orange Fruit");
		
		iterateList(fruitList);
		
		Collections.sort(fruitList);
		System.out.println("String list after sorting" +fruitList);
	}

	private static void iterateList(ArrayList<String> fruitList) {
		for(String temp : fruitList) {
			System.out.println("before sorting    " +temp);
		}
	}

}
