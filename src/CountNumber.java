import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int num = sc.nextInt();
		
		int count=0;		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		System.out.println("number count is even " +count);

	}

}
