package task_wek;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	    public static void main(String[] args) {
	        String content = "abc";
	        String filePath = "example.txt";

	        try {
	            File file = new File(filePath);
	            FileWriter writer = new FileWriter(file);
	            writer.write(content);
	            writer.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	}

