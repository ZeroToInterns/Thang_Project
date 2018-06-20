import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CountBuffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	//takes the number of elements to an array list 
            int d = in.nextInt();
            //create a array list to be stored in another array list
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            
            rows.add(row);
        }
        //the number of queries (search)
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = in.nextInt(); //the row
            int y = in.nextInt(); //the elements inside the row
            
            try {
                System.out.println(rows.get(x - 1).get(y - 1)); //get the value of the row and elements
            } catch (IndexOutOfBoundsException e) { //if the element is not in a given row and elements, prints out error
                System.out.println("ERROR!");
            }
        }
    }
}