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
		double change = tendered - costOfItem;
		sc.close();

//Display an appropriate message if the customer provided too little money or the exact amount.
		if (tendered < costOfItem) {
			System.err.println("This is less than what you need to pay, I cannot accept this.");
		} else if (costOfItem == tendered) {
			System.out.println("Looks like you're all set then! Thank you have a nice day!");
		}
		if (tendered > costOfItem) {
			System.out.println("You gave me " + tendered + ", your change is " + change + ".");

			// turn change into whole number somehow, times it by 100 move decimal point to
			// represent that
			int changeInt = (int) Math.round(change * 100);
			// internet has shown me the light i have rounded the number up and * 100 to
			// account for pennies
			// ints to represent the new values if you move them over two places
			int penny = 1;
			int nickel = 5;
			int dime = 10;
			int quarter = 25;
			int dollar = 100;
			int fiveDollar = 500;
			int tenDollar = 1000;
			int twentyDollar = 2000;

			// int howmany = the int version of change divided by the new versions of the
			// dollars and coins

			int howManyTwenty = changeInt / twentyDollar;
			changeInt = changeInt % twentyDollar;
			if (howManyTwenty >= 1) {
				System.out.print(howManyTwenty + " twenty dollar bill, ");
			}
			int howManyTen = changeInt / tenDollar;
			changeInt = changeInt % tenDollar;
			if (howManyTen >= 1) {
				System.out.print(howManyTen + " ten dollar bill, ");
			}
			int howManyFive = changeInt / fiveDollar;
			changeInt = changeInt % fiveDollar;
			if (howManyFive >= 1) {
				System.out.print(howManyFive + " five dollar bill, ");
			}
			int howManyOne = changeInt / dollar;
			changeInt = changeInt % dollar;
			if (howManyOne >= 1) {
				System.out.print(howManyOne + " one dollar bill, ");
			}
			int howManyQuarter = changeInt / quarter;
			changeInt = changeInt % quarter;
			if (howManyQuarter >= 1) {
				System.out.print(howManyQuarter + " quarter, ");
			}
			int howManyDime = changeInt / dime;
			changeInt = changeInt % dime;
			if (howManyDime >= 1) {
				System.out.print(howManyDime + " dime, ");
			}
			int howManyNickel = changeInt / nickel;
			changeInt = changeInt % nickel;
			if (howManyNickel >= 1) {
				System.out.print(howManyNickel + " nickel, ");
			}
			int howManyPenny = changeInt / penny;
			changeInt = changeInt % penny;
			if (howManyPenny == 1) {
				System.out.print(howManyPenny + " penny. ");
			} else if (howManyPenny > 1) {
				System.out.println(howManyPenny + " pennies. ");
				// to do commas add && statements to every one to check if pennys are used.
			}
		}
	}
}
