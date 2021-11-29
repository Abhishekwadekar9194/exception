package com.csi.core;
import java.util.Scanner;
class AgeException extends Exception{
	AgeException (String sms){
		super(sms);
	}

}
public class ExceptionthrowConcept {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter age:");
		int age=s1.nextInt();
		try{
			if(age<18){
				throw new AgeException("Not Elisible For Vote");

			}else {
				System.out.println("Vote For Successfully");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Abc");
		}
		//System.out.println("SHDASKLUDYKJG");
	}


}



