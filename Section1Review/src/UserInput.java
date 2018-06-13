import java.util.*;
public class UserInput {
	
	private static Scanner kb;

	public static void main(String[] args) {
		
		kb = new Scanner(System.in);
		System.out.print("Enter a your favorite dessert: "); // ask the user to input favorite dessert
		String input = kb.nextLine(); //get the whole line of the input
		System.out.println(input.substring(input.length()-1)); //print the last word of the input
		System.out.println("Enter a double: "); // ask user to enter a double
		double input2 = kb.nextDouble();
		System.out.println("Enter an integer: "); //ask user to enter an integer
		int input3 = kb.nextInt();
		System.out.println(input2 * input3); //multiply double and integer and print it out
		System.out.println((int)(input2 * input3)); //print out the integer part of the product
	}
}
