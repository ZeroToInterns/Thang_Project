
public class Person implements Comparable, Speakable {

	private String name;
	private double GPA;
	public int age;
	
	@Override
	//create a compareTo method that compares people by age
	public int compareTo(Object otherObj) {
		Person otherPerson = (Person)otherObj;
		if (this.age < otherPerson.age) {
			return -1;
		}
		else if (this.age > otherPerson.age) {
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public void speak() {
		System.out.println("Hello, my name is Thang");
	}
}
