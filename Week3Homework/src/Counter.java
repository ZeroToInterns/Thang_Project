import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter
{
    private File inputFile;
    
    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }
    
    public static void main(String args[])
    {
        File inputFile = new File("GettysburgAddress.txt");
        Counter counter = new Counter(inputFile);
        
        int lineCount = counter.countLines();
        System.out.println("Line count: " + lineCount);
        System.out.println("Expected: 25");
        
        int wordCount = counter.countWords();
        System.out.println("Word count: " + wordCount);
        System.out.println("Expected: 267");
        
        int charCount = counter.countChars();
        System.out.println("Character count: " + charCount);
        System.out.println("Expected: 1459");
    }
    
    public int countLines()
    {
        int count = 0;
        try {
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNextLine()) {
        		in.nextLine();
        		count++;
        	}
        			
        }
        catch (FileNotFoundException e) {
        	System.out.println("File was not found");
//        	e.getStackTrace();
        }
        
            
        return count;
    }

    public int countWords()
    {
        int count = 0;        
        try {
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNext()) {
        		in.next();
        		count++;
        	}
        			
        }
        catch (FileNotFoundException e) {
        	System.out.println("File was not found");
//        	e.getStackTrace();
        }
        
        return count;
    }

    public int countChars()
    {
        int count = 0;
        try {
        	Scanner in = new Scanner(this.inputFile);
//        	while(in.hasNextLine()) {
//        		String line = in.nextLine();
//        		
//        		count += line.length()+1;
//        	}
        	for(int i = 1; i <= this.inputFile.length(); i++) {
        		count++;
        	}
        			
        }
        catch (FileNotFoundException e) {
        	System.out.println("File was not found");
//        	e.getStackTrace();
        }
        
        
        return count;
    }
}