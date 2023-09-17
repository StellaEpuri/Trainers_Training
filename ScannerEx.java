package com.corejava.basics;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);

		System.out.println("Enter a name:");
		String name=scan.next();
		
		System.out.println("enter marks:");
		float marks=scan.nextFloat();
		
		System.out.println("Enter contact:");
		int contact=scan.nextInt();
		
		System.out.println(name.toUpperCase());
		
		System.out.println(marks+" "+contact);
	}

}






//ctrl+shift+o---to import