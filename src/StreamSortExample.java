import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1 , "Test1" ,"Ohio"));
		studentList.add(new Student(2 , "Test2" ,"Ohio"));
		studentList.add(new Student(3 , "Test3" ,"NewJersy"));
		studentList.add(new Student(4 , "Test4" ,"California"));
		studentList.add(new Student(5 , "Test5" ,"Pennsylvania"));
		studentList.sort(Comparator.reverseOrder());
		//Collections.sort(studentList);
		
		//studentList.stream().filter(x->x.getAddress().equals("Ohio")).sorted((s1,s2) -> {
		//	if (s1.getName().equals(s2.getName())) { return s1.getRollNo()-s2.getRollNo();} 
		//			else {return s1.getName().compareTo(s2.getName()) ;}}).
		//s			collect(Collectors.toList()).forEach(x->System.out.println(x));
		}
}


















