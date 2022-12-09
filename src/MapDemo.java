import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Student s1= new Student(1,"abb","test1");
		Student s2= new Student(1,"abb","test1");
		
		Map<Student,String> map = new HashMap<Student,String>();
		map.put(null, "test2");
		map.put(null, "test1");
		System.out.println(map);
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 variables are same" +s1 +s2);
		}
		
		else {
			System.out.println("Not same  " +s1.hashCode()+ "  and  " +s2.hashCode());
		}

	}

}
