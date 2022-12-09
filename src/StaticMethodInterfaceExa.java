interface StaticInterf{
	public void abstMeth();
	
	default void statMeth(){
		
	}
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class StaticMethodInterfaceExa {
	
	public void abstMeth() {
		System.out.println("implementing abstratct method");
	}
	public static void main(String[] args) {
		StaticMethodInterfaceExa test =  new StaticMethodInterfaceExa();
		
		StaticInterf.m1();
		
	}

}
