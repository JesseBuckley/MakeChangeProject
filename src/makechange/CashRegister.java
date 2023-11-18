package makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		// The user is *prompted* asking for the *price* of the *item*.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the price of your item?");
		double costOfItem = sc.nextDouble();
//The user is then *prompted* asking how much money was *tendered* by the customer.
		System.out.println("How much money do you give the cashier to pay for this item?");
		double tendered = sc.nextDouble();
		int divisible = 1;
		double change = tendered - costOfItem;
//		double usedCoins = 0; double needDollars = 0; 
		double penny;
		double nickle;
		double dime;
		double quarter;
		double dollar;
		double fiveDollar;
		double tenDollar;
		double twentyDollar;

//Display an appropriate message if the customer provided too little money or the exact amount.
		if (tendered < costOfItem) {
			System.out.println("This is less than what you need to pay, I cannot accept this, have a nice day...");
		} else if (costOfItem == tendered) {
			System.out.println("Looks like you're all set then! Thank you have a nice day!");
		}
		if (tendered > costOfItem) {
			System.out.println("You have given me " + tendered + " your change is " + change);
			
			
				
				}
			}
		}
	

