package com.prowings.basics.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {

		File f = new File("abc.txt");
        char[]ch= new char[(int) f.length()];
        FileReader fr= new FileReader(f);
        fr.read(ch);
        
        for(char ch1:ch)
        {
        	System.out.println(ch1);
        }
	}
}
