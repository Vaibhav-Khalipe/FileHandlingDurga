package com.prowings.basics.File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("Durga1234");
		f.mkdir();
		
		File f1= new File("Durga1234","demo.txt");
		f1.createNewFile();
	}
}
