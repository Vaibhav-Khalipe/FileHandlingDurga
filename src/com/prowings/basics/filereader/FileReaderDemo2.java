package com.prowings.basics.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		File f =new File("abc.txt");
		char[]ch=new char[(int) f.length()];
		FileReader fr= new FileReader(f);
		fr.read();
		for(char ch1:ch)
		{
			count++;
			System.out.println(ch1);
		}
		System.out.println("Total number of characters are :"+count);
	}
}
