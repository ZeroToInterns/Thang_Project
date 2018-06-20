import java.util.ArrayList;
public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		ArrayList<String> colorList = new ArrayList<String>(); //create an array list that contains string of color
		//add 10 colors
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Orange");
		colorList.add("Orange");
		colorList.add("Orange");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Brown");
		colorList.add("Purple");
		colorList.add("Gray");
		
		System.out.println(colorList);
		
		insertFirst(colorList,"Maroon"); //add the new color to the first index 
		addSecondToLast(colorList, "Gold"); // add the new color to the second to last index
		replaceOccurenceColor("Orange", "Peach", colorList);//replace the targeted color with the new color
		
		System.out.println(colorList);
		System.out.println("The amount of time the color appeared is " + countElement(colorList,"Peach"));
		
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
