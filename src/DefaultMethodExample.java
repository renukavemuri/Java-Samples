interface DefaultMethod{
	default void test() {
		System.out.println("default method");
	};
}


public class DefaultMethodExample implements DefaultMethod{
	
	public void test() {
		System.out.println("overriding default method");
	}
	public static void main(String[] args) {
		DefaultMethodExample obj = new DefaultMethodExample();
		obj.test();
	}

}

//default method with respect to multiple inheritance there is a problem
