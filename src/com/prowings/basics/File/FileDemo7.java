package com.prowings.basics.File;

import java.io.File;

public class FileDemo7 {

	public static void main(String[] args) {
		int count =0;
		
		File f= new File("C:");
		String[]s=f.list();
		
		for(String s1:s)
		{
			File f1= new File(f,s1);
			
			if(f1.isDirectory())
			{
				count++;
				System.out.println(s1);
			}
			
		}
		System.out.println("Total Number of directories present are :"+count);
	}
}
