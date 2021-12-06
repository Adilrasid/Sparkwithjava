package com.assignment;

import java.util.Scanner;

/*Java Program to convert int type variables to long*/

public class IntToLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		long l = (long)number;
		System.out.println("Int converted into Long:"+l);
		

	}

}
