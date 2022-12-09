
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValue {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,20,20,10,30,40,10,60);
		//Set<Integer> set = new HashSet<>();
		
		list.stream().filter(x->list.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
		
		/* 
		 * int[] nums= new int[]{1,2,3,4,5,2}; for(int i=0;i<=nums.length;i++) { for(int
		 * j=i+1;j<nums.length;j++) { if(nums[i]==nums[j]) {
		 * System.out.println("duplicate found"); } } }
		 */
		
		/*Integer[] arr = {1,2,3,4,2};
		HashSet <Integer> hs = new HashSet();
//		System.out.println(hs.add(1));
//		System.out.println(hs.add(2));
//		System.out.println(hs.add(1));
	
		for(int l:arr) {
			System.out.println(hs.add(l));
	}*/
}
}

