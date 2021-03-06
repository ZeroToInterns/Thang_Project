
public class IfStatement {

	public static void chooseRoom(String newAnimal, boolean isSick, char gender) {
//		if (newAnimal.equalsIgnoreCase("dog")) {
//			if(isSick == false) {
//				System.out.println("Put it in the Dog room.");
//			}
//			else {
//				System.out.println("Sorry, we don't accept it");
//			}
//			
//		}
//		else if (newAnimal.equalsIgnoreCase("cat")) {
//			if(isSick == false) {
//				System.out.println("Put it in the Cat room.");
//			}
//			else {
//				System.out.println("Sorry, we don't accept it");
//			}
//		}
//		else {
//			
//				System.out.println("Sorry, we don't accept it");
//		}
	
	
	// Faster option
//		if (isSick == true) {
//			System.out.println("Sorry, we don't accept it");
//		}
//		else {
//			if (newAnimal.equalsIgnoreCase("dog")) {
//				System.out.println("Its a dog");
//			}
//			else if (newAnimal.equalsIgnoreCase("cat")) {
//				System.out.println("Its a cat");
//			}
//			else {
//				System.out.println("Sorry, we don't accept it");
//			}
// 
//		}
		
		// Checking for male or female
//		if (isSick == true) {
//			System.out.println("Sorry, we don't accept it");
//		}
//		else {
//			if (gender == 'M') {
//				if (newAnimal.equalsIgnoreCase("dog")) {
//					System.out.println("Its a male dog");
//				}
//				else if (newAnimal.equalsIgnoreCase("cat")) {
//					System.out.println("Its a male cat");
//				}
//				else {
//					System.out.println("Sorry, we don't accept it");
//				}
//			}
//			else if (gender == 'F'){
//				if (newAnimal.equalsIgnoreCase("dog")) {
//					System.out.println("Its a female dog");
//				}
//				else if (newAnimal.equalsIgnoreCase("cat")) {
//					System.out.println("Its a female cat");
//				}
//				else {
//					System.out.println("Sorry, we don't accept it");
//				}
//			}
//			else {
//				System.out.println("Invalid gender");
//			}
//		}
		
		//Using a helper method to make the code looks cleaner
		if (isSick == true) {
			System.out.println("Sorry, we don't accept it");
		}
		else {
			if (newAnimal.equalsIgnoreCase("dog")) {
				System.out.println(determineGender(gender) + " Dog");
			}
			else if (newAnimal.equalsIgnoreCase("cat")) {
				System.out.println(determineGender(gender) + " Cat");
			}
			else {
				System.out.println("Sorry, we don't accept it");
			}
 
		}
	}
	
	//helper method
	public static String determineGender(char gender) {
		String result;
		if (gender == 'M') {
			result = ("Its a male");
		}
		else if (gender == 'F') {
			result = ("Its a female");
		}
		else {
			result = ("Error: Invalid");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
//		double temperature = 77.5;
//		if (temperature <= 120 || temperature >= 77.5) {
//			System.out.println("It's Hot");
//		}
//		else if(temperature >= 15 || temperature < 77.5) {
//			System.out.println("It's livable");
//		}
//		else{
//			System.out.println("It's Cold");
//		}
		
	
		chooseRoom("Cat", false, 'M');
	}

}
