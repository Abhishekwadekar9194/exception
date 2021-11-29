package com.csi.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadWrite
{
	void file() throws FileNotFoundException{
		//FileInputStream f1=new FileInputStream("D:\\abhishek");
		File a1=new File("D:\\xyz.txt");
		Scanner sc=new Scanner(a1);
		String str=sc.nextLine();
		System.out.println(str);
	}
}
public class ExceptionThrowsConcept {
	public static void main(String[] args)  {
		ReadWrite r1=new ReadWrite();
		try {
			r1.file();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
