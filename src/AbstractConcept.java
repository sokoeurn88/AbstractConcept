
public class AbstractConcept {

	public static void main(String[] args) {

		Test t = new Test();
		int myAge = t.age;
		System.out.println(myAge);
		
		String myName = t.name;
		System.out.println(myName);
		
		t.locate();
		t.printName();
		t.woosh();
	}

}
