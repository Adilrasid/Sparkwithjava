/*Sample Input and Output 1:     Enter the account number:9876543210
Enter initial balance:15000
Enter the amount to be deposited:1500
Available balance is:16500.00
Enter the amount to be withdrawn:500
Available balance is:16000.00 */
package com.assignment;

import java.util.Scanner;

class Account {
	int Deposit(int balance, int amountdeposited) {
		amountdeposited = balance + amountdeposited;
		return amountdeposited;

	}

	int WithDraw(int deposited, int amountwithdrawn) {
		amountwithdrawn = deposited - amountwithdrawn;
		return amountwithdrawn;
	}
}

class SampleInputOutput1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		long accno = sc.nextLong();
		System.out.println("Enter the initial balance");
		int balance = sc.nextInt();
		System.out.println("Enter the amount to be deposited");
		int amountdeposited = sc.nextInt();
		Account account = new Account();
		int deposited = account.Deposit(balance, amountdeposited);
		System.out.println("Available balance is:" + deposited);
		System.out.println("Enter the amount to be withdrawn");
		int amountwithdrawn = sc.nextInt();
		int withdrwan = account.WithDraw(deposited, amountwithdrawn);
		System.out.println("Available balance is:" + withdrwan);

	}

}
