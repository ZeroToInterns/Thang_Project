public class BattleShip {
	
	private boolean[][] grid;
	public BattleShip() {
		grid = new boolean[10][10];
	}
	
	public static void main(String[] args) {
		BattleShip game1 = new BattleShip();
//		game1.printGrid();
		
//		game1.placeFishingBoat(0, 0);
//		game1.printGrid();
		
		game1.placeCarrierBoat(3, 1, "vertical");
		game1.placeCarrierBoat(5, 0, "horizontal");
		game1.printGrid();
	}
	
	//place a 1 unit fishing boat at a location
	public void placeFishingBoat(int x, int y) {
		grid[x][y] = true;
	}
	
	//print the full grid of the game
	public void printGrid() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");		
	}
	
	//place a 3 unit carrier boat
	public void placeCarrierBoat(int x, int y, String orientation) {
		if(orientation.equalsIgnoreCase("Vertical")) {
			grid[x][y] = true;
			grid[x][y+1] = true;
			grid[x][y+2] = true;
		}
		else if (orientation.equalsIgnoreCase("Horizontal")) {
			grid[x][y] = true;
			grid[x+1][y] = true;
			grid[x+2][y] = true;
		}
		else {
			System.out.println("Not a valid direction");
		}
	}
}
