
public class ElectronicStore {

	public static void getPrice(String object, boolean damage) {
		double reducePrice;
		switch (object) {
			case "Ipod":
				if (damage == true) {
					reducePrice = 299 - (299 * .75);
					System.out.println("$" +reducePrice);
					break;
				}
				else {
					System.out.println("$299");
					break;
				}
			case "Macbook":
				if (damage == true) {
					reducePrice = 1599 - (1599 * .75);
					System.out.println("$" + reducePrice);
					break;
				}
				else {
					System.out.println("$1599");
					break;
				}
			case "TV":
				if (damage == true) {
					reducePrice = 899 - (899 * .75);
					System.out.println("$" +reducePrice);
					break;
				}
				else {
					System.out.println("$899");
					break;
				}
			case "Phone":
				if (damage == true) {
					reducePrice = 799 - (799 * .75);
					System.out.println("$" + reducePrice);
					break;
				}
				else {
					System.out.println("$799");
					break;
				}				
			case "Charger":
				if (damage == true) {
					reducePrice = 29 - (29 * .75);
					System.out.println("$" + reducePrice);
					break;
				}
				else {
					System.out.println("$29");
					break;
				}
			default:
				System.out.println("Object not in the store");
		}
			
	}	
}
