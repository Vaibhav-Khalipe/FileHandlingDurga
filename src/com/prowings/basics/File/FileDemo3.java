package com.prowings.basics.File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("Durga12345");
		f.mkdir();
		
		File f1=new File(f,"demo.txt");
		f1.createNewFile();
		
		System.out.println(f1.exists());
	}
}
