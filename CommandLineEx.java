package com.corejava.basics;

public class CommandLineEx {

	public static void main(String[] args) {//20 30 sandy 25.88 true
		
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);

		int result=i+j;
		
		String name=args[2];
		
		float f=Float.parseFloat(args[3]);
		
		boolean b=Boolean.parseBoolean(args[4]);
		
		System.out.println("the sum:"+result);

		System.out.println(name+"  "+f+" "+b);

	}

}
