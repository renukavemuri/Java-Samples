import java.util.ArrayList;
import java.util.Collections;

public class SortingIntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(15);
		integerList.add(10);
		integerList.add(1);
		integerList.add(2);
		integerList.add(8);
		integerList.add(3);
		
		for(Integer temp:integerList) {
			System.out.println(temp);
		}
		Collections.sort(integerList);
		System.out.println("after sorting" +integerList);

	}

}
