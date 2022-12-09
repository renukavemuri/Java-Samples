import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String str = sc.next();
		String orig_str=str;
		
		int length = str.length();
		
		String rev="";
		
		for(int i=length-1;i>=0;i--) {   
				rev=rev+str.charAt(i);
			}
		if(orig_str.equals(rev)) {
			System.out.println(orig_str+ " is a palindrome");
		}
		else {
			System.out.println(orig_str+ " is not a palindrome");
		}
			
	}

}
