
public class Box {
	
	private double length;
	private double width;
	private double height;
	
	public Box(double length, double width, double height) {
		
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	//Constructor OVERLOADING
	public Box(double sideLength) {
		
		this.length = sideLength;
		this.width = sideLength;
		this.height = sideLength;
	}

	public static void main(String[] args) {
		
		Box firstBox = new Box(10, 15, 20);
		System.out.println(firstBox.getVolume());
		System.out.println(getVolume(5, 5, 5)); // static method
		
		Box secondBox = new Box(15, 20, 25);
		Box thirdBox = new Box(15, 20, 25);
		//System.out.println(secondBox.equals(secondBox)); //Compare if two object is the same instance, in these case it will return true
		//System.out.println(thirdBox.equals(thirdBox)); //Return false because two object is not the same instance
		
		Box cube = new Box(3);
		System.out.println(cube.getVolume());
		
	}
	
	//Getter
	public double getLength() {
		
		return this.length;
	}
	
	//Setter
	public void setLength(double newLength) {
		
		this.length = newLength;
	}
	
	public double getWidth() {
		
		return this.width;
	}
	
	public double getHeight() {
		
		return this.height;
	}
	
	public double getVolume() {
		
		double volume = this.computeArea() * this.height; //this.computerArea() is a helper method
		return volume;
	}
	
	public double computeArea() {
		
		double result = this.length * this.width;
		return result;
	}
	
	//static method
	public static double addTwoNumbers(double num1, double num2) {
		
		double result = num1 + num2;
		return result;
	}
	
	public static double getVolume(double length, double width, double height) {
		
		double volume = length * width * height;
		return volume;
	}
	
	// method that trick two object with the same parameter to return true despite it not the same instance
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}

}
