package com.prowings.basics.File;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args)throws IOException {
		
		
		File f= new File("C:\\JavaBasicPrograms","abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}
	
}
