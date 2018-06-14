
public class SubSandwichTester {

	public static void main(String[] args) {
		SubSandwich sub = new SubSandwich(SubSandwich.CHICKEN, 12, true);
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: chicken 12 true 10.45");

        sub = new SubSandwich(SubSandwich.CHICKEN, 8, true); 
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: chicken 12 true 10.45");
        
        sub = new SubSandwich(SubSandwich.CHICKEN, 6, true);
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: chicken 6 true 7.0");
        
        sub = new SubSandwich(SubSandwich.CHICKEN, 6, false);
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: chicken 6 false 5.5");

        sub = new SubSandwich(SubSandwich.PASTRAMI, 6, false);
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: pastrami 6 false 6.95");
        
        sub.setSize(12); 
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: pastrami 12 false 9.5");  
        
        sub.setSize(1); 
        System.out.println("Bad setSize: " + sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: pastrami 12 false 9.5");  
        
        sub = new SubSandwich(SubSandwich.PASTRAMI, 12, true);
        System.out.println(sub.getType() + " " + sub.getSize()
            + " " + sub.isExtraMeat() + " " + sub.getCost());
        System.out.println("Expected: pastrami 12 true 11.0");

	}

}
