

public class ArrayPractice {
	private int[] arrayContent;
	public ArrayPractice() {
		//one way to create an array with size of 10 and value of 1-10;
//		int[] arrayContent = new int[10];
//		arrayContent[0] = 1;
//		arrayContent[1] = 2;
//		arrayContent[2] = 3;
//		arrayContent[3] = 4;
//		arrayContent[4] = 5;
//		arrayContent[5] = 6;
//		arrayContent[6] = 7;
//		arrayContent[7] = 8;
//		arrayContent[8] = 9; 
//		arrayContent[9] = 10;
		
		//another way to create an array
		arrayContent = new int[]{1,2,3,4,5,6,7,8,9,10};
	}
	
	//calculate the sum of the array values
	public int sum() {
		int sum = 0;
		for(int i = 0; i < arrayContent.length; i++) {
			sum +=arrayContent[i];
		}
		return sum;
	}
	
	//get the average of the array value
	public double average() {
		int sum = 0;
		for(int i = 0; i < arrayContent.length; i++) {
			sum += arrayContent[i];
		}
		return sum/arrayContent.length;
	}
	
}
