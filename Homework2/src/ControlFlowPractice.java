
public class ControlFlowPractice {

	//calculate the cost based on the distance
	public double calculateCost(double distance) {
		double cost = 0;
		if (distance >= 50 ) {
			cost = 100;
		}
		else if (distance < 50 && distance >= 25) {
			cost = 50;
		}
		else if (distance >= 0 && distance < 25) {
			cost = 10;
		}
		else {
			cost = 0;
		}
		return cost;
	}
	
	
	
	//get the return value when the dice is rolled
	public void rollDice(int value) {
		switch (value) {
		case 1:
			System.out.println("The value rolled is " + value);
			break;
		case 2:
			System.out.println("The value rolled is " + value);
			break;
		case 3:
			System.out.println("The value rolled is " + value);
			break;
		case 4:
			System.out.println("The value rolled is " + value);
			break;
		case 5:
			System.out.println("The value rolled is " + value);
			break;
		case 6:
			System.out.println("The value rolled is " + value);
			break;
		default:
			System.out.println("Not a valid roll");
		}
	}
	
	//Return the letter of the word when the requested an index
//	public String findLetterAt(int index, String word) {
//		String letter = "";
//		for (int i = 0; i < word.length(); i++) {
//			if(i == index) {
//				letter = word.substring(i, i+1);
//			}
//			
//		}
//		return letter;
//	}
	
	//find the second letter and return it's index position
	public int findLetterAt(String letter, String word) {
		int position = 0;
		for (int i = 0; i < word.length(); i++) 
		{
			if(word.substring(i, i+1).equals(letter)) 
			{
				if (position == 1) 
				{
					return i;
				}
				else 
				{
					position++;
				}
			}
		}
		return 0;
	}
}
