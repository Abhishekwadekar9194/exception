package com.csi.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class readAndwrite
{
	void file() throws FileNotFoundException{
		FileInputStream f1=new FileInputStream("D:xyz.txt");
		/*Scanner sc=new Scanner(f1);
		String aa=sc.nextLine();
		System.out.println(aa);*/
		System.out.println("file done");

	}
}
public class ExceptionHandlingThrowsConcept {
	public static void main(String[] args) {
		readAndwrite r1=new readAndwrite();
		try {
			r1.file();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
