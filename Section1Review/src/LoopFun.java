import java.util.*;
public class LoopFun {

	public static void main(String[] args) {
		LoopFun f = new LoopFun();
		
		//System.out.println(f.getPermutationCount(5));
//		System.out.println(f.removeDuplicates(""));
		System.out.println(f.sumSeries(4));
//		System.out.println(f.product(5));
//		System.out.println(f.largestPowerLessThan(8));
//		System.out.println(f.sumOdd(16));
//		System.out.println(f.getECount("Feed"));
	}
	// calculate the sum of the permutation
	public int getPermutationCount(int n) {
		int product = 0;
		if (n <= 0) {
			product = 0;
		}
		else {
			product = 1;
			//loop that calculate the sum by each value
			for (int i = 1; i <= n; i++) {
				product *= i;
			}
		}
		return product;
		 
	}
	
	public String removeDuplicates(String word) {
		String empty = ""; //create an empty string
		if(word.equals(empty)) {
			throw new NullPointerException();
		}
		for(int i = 0; i < word.length(); i++) {
			String letter = word.substring(i, i+1); // create a letter 
			if(!empty.contains(letter)) { //check to see if the empty string has the letter
				empty += letter;	//add the letter to the empty string
			}
		}
		return empty;
	}
	
	//get the series of value and add it together
	public double sumSeries(int n) {
		double sum = 0;
		if (n == 0) {
			sum = 0;
		}
		else {
			for (int i = 0; i < n; i++) {
				sum += 2 / Math.pow(2, i);
			}
		}
		return sum;
	}
	
	//prompt user to to enter how many integer they want to enter and return the product of all the integer together
	public int product(int n) {
		Scanner kb = new Scanner(System.in); 
		int product = 1;
		if(n < 0) {	//if user put - number in the parameter, it will return -1
			product = -1;
		}
		else if(n == 0) {	//if user enter 0, it will return 0
			product = 0;
		}
		else {	//ask user to enter how many integer they want and return the product
			for (int i = 0; i < n; i++) {
				System.out.print("Enter integer " + (i+1) + " :");
				int input2 = kb.nextInt();
				product *= input2;
			}
		}
		return product;	
	}
	
	//get the largest power of the equation that is 1 less then the value
	public int largestPowerLessThan(int value) {
		int twoToThePower = 2;
		int i = 0;
		if (value <= 0 && value == 1 ) {
			i = -1;
		}
		while (Math.pow(twoToThePower, i) < value) {
				Math.pow(twoToThePower, i);
				i++;	
			}
			return i-1;	

	}
	
	// add all the odd number in the interval of the value
	public int sumOdd(int value) {
		int sum = 0;
		for (int i = 1; i < value; i = i+2) {
			sum += i;
		}
		return sum;
	}
	
	//get the number of e in a word
	public int getECount(String word) {
		int count = 0;
		if (word.equals("")) {
			throw new NullPointerException();
		}
		for (int i = 0; i < word.length(); i++) {
			String letter = word.substring(i, i+1);
			if(letter.equalsIgnoreCase("e")) {
				count++;
			}
		}
		return count;
		
	}
}
