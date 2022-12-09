import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {
		List<String> strlist = Arrays.asList("java","python","C","Oracle","Java");
		
		Set<String> set=new HashSet<>();
		
		//strlist.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
		boolean flag=false;
		
		for(String l : strlist) {
			if(set.add(l)==false) {
			System.out.println("Duplicate found " +l);
			flag=true;
		}
		}
		if(flag==false)
		{
			System.out.println("Duplicate not found ");
		}
}
}