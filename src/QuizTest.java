import java.util.HashSet;

class Animal {
	public int i = 1;

	public Animal() {
	 i = 2;
	}

	@Override
	public String toString() {
		return "Animal [i=" + i + "]";
	}

}

public class QuizTest {

	public static void main(String[] args) throws Exception {
		HashSet<Animal> hs= new HashSet();
		hs.add(new Animal());
		hs.add(new Animal());
		for(Animal a: hs) {
			System.out.println(a);
		}
	}

}
