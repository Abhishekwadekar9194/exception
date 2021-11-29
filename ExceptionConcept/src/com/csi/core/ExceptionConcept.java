package com.csi.core;

public class ExceptionConcept {
	public static void main(String[] args) {
		ExceptionConcept e1=new ExceptionConcept();
		try {
			e1.divide();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("first exception handle");
		}
	}
	
	void divide(){
		int res=10/0;
		System.out.println(res);
	}

}
