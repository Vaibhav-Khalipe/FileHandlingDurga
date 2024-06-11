package com.prowings.basics.File;

import java.io.File;
//Program to display only file names present in particular folder
public class FileDemo6 {

	public static void main(String[] args) {
		
		File f = new File("C:\\JavaBasicPrograms");
		String[]s=f.list();
		int count =0;
		
		for(String s1:s)
		{
			File f1= new File(f,s1);
			
			if(f1.isFile())
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("Total number of files present are :"+count);
	}
}
