package com.prowings.basics.File;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo8 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt");

		fw.write(100);
		fw.write("urga\nSotwareSolutions");
		fw.write("\n");
		char[] ch = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		

	}
}
