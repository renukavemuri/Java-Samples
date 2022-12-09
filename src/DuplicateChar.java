
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		System.out.println(findDuplicateCharValue("code decode"));
	}
	
	
	private static Set<Character> findDuplicateCharValue(String name) {
		
		Set<Character> duplicate = new LinkedHashSet<>();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					duplicate.add(name.charAt(j));
				}
			}
		}
		return duplicate;	
	}
}
