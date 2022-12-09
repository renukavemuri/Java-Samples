
public class ArraySample {

	public static void main(String[] args) {
		int[] array = new int[]{15,2,3,7,8,10};
		int expSum=17;
		int sum= 0;
		int len=array.length;
		for(int i=0;i<len;i++) {
			if(array[i]==expSum) {
			System.out.println("sum found at index" + array[i]);
		   }
			for(int j=i+1;j<len;j++) {
				sum=array[j]+array[i];
				
			if(sum==expSum) {
				System.out.println("expected sum found at index   " +i+  "  "   +j);
			}
	}

}
}
}
