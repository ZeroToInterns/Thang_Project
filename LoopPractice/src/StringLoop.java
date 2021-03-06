public class StringLoop {

	//print number 0-100
	public void printPhrase() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("The current number is " + i);
		}
	}
	
	//print even number from 0-100
	public void printEvenNumber() {
		for (int i = 0; i <=100; i++) {
			if(i%2 == 0) {
				System.out.println("The even value is " + i);
			}
		}
	}
	
	//print odd number
	public void printOddNumber() {
		for (int i = 0; i <=100; i++) {
			if(i%2 != 0) {
				System.out.println("The odd value is " + i);
			}
		}
	}
	
	//print the number of times letter o appear in a word
	public int countNumberOfO(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if (word.substring(i, i+1).equalsIgnoreCase("O")) {
				count++;
			}
		}
		
		return count;
	}
	
	//using modified (enhance) for loop to iterate over the entire string
	//error string is an object, cannot iterate
//	public int countOs(String word) {
//		int count = 0;
//		for(String firstElement: word) {
//			if(firstElement.equalsIgnoreCase("o")) {
//				count++;
//			}
//		}
//		return count;
//	}
	
	//print out each word in a pyramid pattern
	public void printPattern(String word) {
		for (int i = 0; i < word.length(); i++) {
			for(int j = 0; j < i+1 ; j++) {
				System.out.print(word.substring(i, i+1));		
			}
			System.out.println();
		}
	}
	
	//try/catch exception demonstration
	public void printString(String word) {
		try {
			for(int i = 0; i < word.length()+1; i++) {
				System.out.print(word.substring(i, i+1));
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(" Exception occurred");
			//System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	//knowing when to throw exception
	public static void divide(int num1, int num2) {
		if(num2 ==0) {
			throw new NullPointerException();
		}
		else {
			System.out.println(num1/num2);
		}

		
	}
	
}
