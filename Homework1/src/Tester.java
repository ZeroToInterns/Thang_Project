
public class Tester {
	public static void main(String[] args) {
		Student student1 = new Student("Thang", 3.4);
		System.out.println(student1.getName());
		System.out.println(student1.getGPA());
		System.out.println();
		
		student1.setName("Michael");
		student1.changeGPA(4.0);
		System.out.println(student1.getName());
		System.out.println(student1.getGPA());
	}

}
