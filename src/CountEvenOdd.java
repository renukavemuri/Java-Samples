import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int num = sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		
		while(num>0) { 
			int value=num%10;
			
			if (value%2==0) 
				even_count++;
			else
				odd_count++;
			}
		
		System.out.println("even count is  " +even_count);
		
		System.out.println("odd count is  " +odd_count);

	}

}
