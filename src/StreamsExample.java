import java.util.*;
import java.util.stream.*;
import java.util.List;
public class StreamsExample {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Kiran");
		strList.add("Renuka");
		strList.add("Meenakshi");
		strList.add("Karthik");
		System.out.println(strList);
		
		/* with out streams List<String> l1 = new ArrayList<String>();
		for (String str : strList) {
			if (str.length() >= 7) {
				l1.add(str);
			}
		}
		System.out.println(l1);*/
		//with streams
		
		List<String> l2 = strList.stream().filter(S -> S.length() >= 7).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
