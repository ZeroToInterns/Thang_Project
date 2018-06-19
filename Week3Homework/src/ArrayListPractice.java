import java.util.ArrayList;
public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		ArrayList<String> myColor = new ArrayList<String>(); //create an array list that contains string of color
		//add 10 colors
		myColor.add("Red");
		myColor.add("Blue");
		myColor.add("Green");
		myColor.add("Yellow");
		myColor.add("Orange");
		myColor.add("Orange");
		myColor.add("Orange");
		myColor.add("Black");
		myColor.add("White");
		myColor.add("Brown");
		myColor.add("Purple");
		myColor.add("Gray");
		System.out.println(myColor);
		insertFirst(myColor,"Maroon"); //add the new color to the first index 
		addSecondToLast(myColor, "Gold"); // add the new color to the second to last index
//		System.out.println("The amount of time the color appeared is " + countElement(myColor,"Orange"));
		replaceOccurenceColor("Orange", "Peach", myColor);
		System.out.println(myColor);
		System.out.println("The amount of time the color appeared is " + countElement(myColor,"Peach"));
		
	}
	
	
	//method to add a new color in the first position
	public static void insertFirst(ArrayList<String> list, String newColor) {
		list.add(0, newColor);
	}
	
	//add a new color in the second to last index
	public static void addSecondToLast(ArrayList<String> list, String newColor) {
		list.add(list.size()-1, newColor);
	}
	
	//
	public static int countElement(ArrayList<String> list, String myColor) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(myColor)) {
				count++;
			}
		}
		return count;
	}
	
	
	//replace the targeting color with a new color in the array list
	public static void replaceOccurenceColor(String color, String newColor, ArrayList<String> list){
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(color)) {
				list.set(i, newColor);
			}
		}	
	}

}
