
public class ReverseString {

	public static void main(String[] args) {
		String str="welcome";
		String rev="";
		
		//using string concatination "+"
		
		int length = str.length(); //7
		
		
	//	for(int i=length-1;i>=0;i--) { //6   
		//	rev=rev+str.charAt(i);
	//	}
		
	//	System.out.println(rev);
		
		// Using StringBuffer class
		
	//	StringBuffer sb = new StringBuffer(str);
	//	System.out.println(sb.reverse());
		
		// Using char[] array
		
		char a[] = str.toCharArray();
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		
		System.out.println(rev);
	}

}
