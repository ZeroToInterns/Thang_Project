
public class Car extends Vehicle {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.drive();
		myCar.move();
		
	}
	
	//Overriding method
	@Override
	public void move() {
		System.out.println("The car moved 10 feet");
		
	}
	
	public void drive() {
		System.out.println("The car has moved 5 feet");
	}
}
