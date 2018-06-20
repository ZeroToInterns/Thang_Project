
public class GroceryList {
	
	private String[] groceryList;
	
	public GroceryList() {
		groceryList = new String[50];
	}
	
	public GroceryList(int length) {
		groceryList = new String[length];
	}
	
	public GroceryList(String[] list) {
		groceryList = new String[list.length];
		for(int i = 0; i < list.length; i++) {
			groceryList[i] = list[i];
		}
	}
	
	//find the index of the longest item
	public int findLongestItem() {
		int findItemIndex = 0;
		String longestItem = groceryList[0];
		for(int i = 0; i < groceryList.length; i++) {
			if(longestItem.length() < groceryList[i].length()) {
				longestItem = groceryList[i];
				findItemIndex = i;
			}
		}
		return findItemIndex;
	}
	
	//find the index of the shortest item
	public int findShortestItem() {
		int findItemIndex = 0;
		String shortestItem = groceryList[0];
		for(int i = 0; i < groceryList.length; i++) {
			if(shortestItem.length() > groceryList[i].length()) {
				shortestItem = groceryList[i];
				findItemIndex = i;
			}
		}
		return findItemIndex;
	}
}
