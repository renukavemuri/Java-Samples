import java.util.stream.*;
import java.util.*;
public class StreamsDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
	
		/* without streams
		for(Integer I : list) {
			if(I%2==0) {
				l1.add(I);
		}
		}
		System.out.println(l1);*/
		
		//with streams
		//List<Integer> l1 = list.stream().filter(I->I%2==0).collect(Collectors.toList());
		//System.out.println(l1);
		List<Integer> l2 = list.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l2);
	}
}