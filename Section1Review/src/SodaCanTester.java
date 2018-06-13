
public class SodaCanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SodaCan pepsi = new SodaCan();
	       System.out.println("Radius: " + pepsi.getRadius());
	       System.out.println("Expected: 1.2109 "); 
	       
	       System.out.println("Height: " + pepsi.getHeight());
	       System.out.println("Expected: 4.704"); 
	       
	       System.out.println("Contents: " + pepsi.getContents());
	       System.out.println("Expected: 12.006923229266999");        
	       
	       SodaCan coke = new SodaCan(2, 6);
	       
	       System.out.println("Contents: " + coke.getContents());
	       System.out.println("Expected: 41.779102293798665");   
	       
	       coke.drink(10);
	       coke.drink(5.0);
	       
	       System.out.println("Contents after drinking: " + coke.getContents());
	       System.out.println("Expected: 26.779102293798665");  
	       
	       System.out.println("Radius: " + coke.getRadius());
	       System.out.println("Expected: 2.0"); 
	       
	       System.out.println("Height: " + coke.getHeight());
	       System.out.println("Expected: 6.0"); 
	       
	       
	}

}
