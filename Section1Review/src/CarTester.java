
public class CarTester {
	 public static void main(String[] args)
	    {      
	        ElectricCar leaf = new ElectricCar("Leaf", 150);
	        System.out.println(leaf.getMake());
	        System.out.println("Expected: Leaf");
	        
	        System.out.println(leaf.getCurrentRange());
	        System.out.println("Expected: 0");
	        leaf.charge();
	        leaf.drive(50);
	        leaf.drive(25);
	        System.out.println(leaf.getCurrentRange());
	        System.out.println("Expected: 75");
	        leaf.charge();
	        System.out.println(leaf.getCurrentRange());
	        System.out.println("Expected: 150");
	        
	        
	        ElectricCar bolt = new ElectricCar("Bolt",200);
	        System.out.println(bolt.getMake());
	        System.out.println("Expected: Bolt");
	        
	        bolt.charge();
	        System.out.println(bolt.getCurrentRange());
	        System.out.println("Expected: 200");
	        bolt.drive(100);
	        bolt.drive(50);
	        System.out.println(bolt.getCurrentRange());
	        System.out.println("Expected: 50");
	    }
}
