import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to multiply");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(n*i);
			
		}

	}

}
