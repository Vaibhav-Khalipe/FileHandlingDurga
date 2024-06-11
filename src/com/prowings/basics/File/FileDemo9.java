package com.prowings.basics.File;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo9 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt", true);
		
		fw.write("\nvaibhav");
		fw.write("\n");
		char[]ch= {'a','b','c','d','e','f','g'};
		fw.write(ch);
		fw.write("\n");
		fw.write("Thank You");
		fw.flush();
		fw.close();

	}
}
