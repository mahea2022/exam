package exam_fileRead;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class fileRead {


	    public static void main(String[] args) {
	        String filePath = "file\\dictionary.txt"; 

	        try {
	            doesFileExist(filePath);
	        } catch (IOException e) {
	            System.out.println("An error occurred while processing the file: " + e.getMessage());
	        }
	    }

	    public static void doesFileExist(String path) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(path));
	        String line;

	        while ((line = reader.readLine()) != null) {
	            String[] words = line.split("[^a-zA-Z]+");

	            for (String word : words) {
	                if (!word.isEmpty()) {
	                    System.out.println(word);
	                }
	            }
	        }

	        reader.close();
	    }
	}





