package com.assignment;

import java.util.Scanner;
/*Java Program to convert boolean variables into string*/

public class BooleanToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boolean value");
		boolean b1 = sc.nextBoolean();
		String s1 = String.valueOf(b1);
		System.out.println("boolean converted into string:"+s1);

	}

}
