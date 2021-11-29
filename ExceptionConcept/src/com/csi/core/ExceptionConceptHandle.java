package com.csi.core;

public class ExceptionConceptHandle {
	public static void main(String[] args) {
		System.out.println("START THE PGOGRAM");
		try {
			int res=10/0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("HANDLE EXCEPTION ");
		}
		System.out.println("END PROGRAM ");
	}

}
