
public class Student {
	
	//instance variable for the student class
	private String name;
	private double GPA;
	
	//the constructor for the student class
	//it contains a parameter of name and GPA
	public Student (String name, double GPA) {
		this.name = name;
		this.GPA = GPA;
	}
	
	//this method return the name
	public String getName() {
		return this.name;
	}
	
	//this method set a new name 
	public void setName(String newName) {
		this.name = newName;
		System.out.println("The new name is " + newName);
	}
	
	//this method return the GPA
	public double getGPA() {
		return this.GPA;
	}
	
	//this method set a new GPA
	public void changeGPA(double newGPA) {
		this.GPA = newGPA;
	}
	
	
}
