package com.prowings.basics.File;

//Program to Display number of files present in particular folder
import java.io.File;

public class FileDemo5
{
	public static void main(String[] args) {
		int count=0;
		
		File f= new File("C:\\JavaBasicPrograms");
		
		String[]s=f.list();
		
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
			
		}
		System.out.println("Total number of files present are :"+count);
	}
}