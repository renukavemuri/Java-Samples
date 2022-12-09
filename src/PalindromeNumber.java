import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter number");
		
		System.out.println("enter number");
		
		int num = sc.nextInt();
		
		int orig_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num = num/10;
		}
		
	if(rev==orig_num) {
		System.out.println(orig_num+  "number is palindrome");
	}
	else 
		System.out.println("number is not palindrome");
	}

}
