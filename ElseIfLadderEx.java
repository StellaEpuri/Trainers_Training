package com.corejava.basics;

import java.util.Scanner;

public class ElseIfLadderEx {

	public static void main(String[] args) {

		// int num= 85;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("it is negative number");
		} else if (num > 0) {
			System.out.println("it is positive number");
		} else {
			System.out.println("it is zero");
		}
	}

}

//ctrl+A...ctrl+shift+f----to format