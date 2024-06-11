package com.prowings.basics.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("abc.txt");
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write(101);
		bw.newLine();
		char[]ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Vaibhav");
		bw.newLine();
		bw.write("Java Devoleper");
		bw.flush();
		bw.close();
	}
}
