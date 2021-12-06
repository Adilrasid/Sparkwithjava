package com.assignment;

import java.util.Scanner;

/*Java Program to convert long type variables into int*/

public class LongToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long l = sc.nextLong();
		int number = (int)l;
		System.out.println("Long converted into Int:"+number);

	}

}
