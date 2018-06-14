import java.util.*;
public class StringManipulation {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String input = kb.nextLine();
		String space = " ";
		String firstName = input.substring(0,input.indexOf(space));
		System.out.println(input.substring(0, 1));
		System.out.println(firstName);
		System.out.println(input.substring(input.indexOf(space) + 1, input.length()));
		System.out.println(input.substring(4, 7));
	}

	

}
