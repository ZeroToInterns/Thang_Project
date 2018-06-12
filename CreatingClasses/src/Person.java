
public class Person {
	private static final int MY_CONSTANT = 123456789;
	private static String name = "Thang";
	private static int age = 19;
	private static String hairColor = "black";
	private static String eyeColor = "Brown";
	private static double weight = 150.0;
	private static char gender = 'M';
	
	
	public Person() {
		System.out.println("Created a new person");
	}
	
	public static void main(String[] args) {
		
		Person myPerson = new Person();
		myPerson.hairColor = "Brown";
		myPerson.gender = 'F';
//		System.out.println(myPerson.MY_CONSTANT);
		
		hairColor = "Blue"; //changing the hairColor instance variable from black to blue
		Person person2 = new Person();
//		System.out.println(person2.hairColor);
		
		
		
	}
	
	public void printVarialbe() {
			
		System.out.println(name);		
		String myName = "Thang";	
	}
	
}
