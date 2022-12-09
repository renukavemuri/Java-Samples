
public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Values before swapping" +a +"\n" +b);
		
		/*
		 * int temp=a; a=b; b=temp;
		 */
		
		
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Values after swapping" +a +"\n" +b);
		
	
	}

}
