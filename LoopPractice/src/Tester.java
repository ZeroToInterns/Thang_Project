
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLoop num = new StringLoop();
		//num.printPhrase();
		//num.printEvenNumber();
		//num.printOddNumber();
		//System.out.println("The number of o is " + num.countNumberOfO("Food"));
		//num.printPattern("Thang");
		//num.printString("Hello World");
		//StringLoop.divide(4, 2);
		
		Person person1 = new Person();
		person1.age = 10;
		
		Person person2 = new Person();
		person2.age = 15;
		
		System.out.println(person1.compareTo(person2));
		
		person1.speak();
	}	
}
