package sExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("st.txt");
	FileReader fr = new FileReader(file);
	/*
	 * Throws will throw error in the main method
	 */
	
}

}