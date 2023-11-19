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
			double toShort = costOfItem - tendered;
			System.out.print("You are ");
			System.out.printf("%.2f", toShort);
			System.out.println(" dollars short.");
		} else if (costOfItem == tendered) {
			System.out.println("Looks like you're all set then! Thank you, have a nice day!");
		}
		
		if (tendered > costOfItem) {
			calculateChange(change, tendered, costOfItem);
//interesting struggle to print commas and periods in the right places when i wanted them. finally got it though.
		}
	}
	
	
	
	public static void calculateChange(double change, double tendered, double costOfItem) {
		
		int changeInt = (int) Math.round(change * 100);
		
		change = (float) change;
		int penny = 1; int nickel = 5; int dime = 10; int quarter = 25;
		int dollar = 100; int fiveDollar = 500; int tenDollar = 1000; int twentyDollar = 2000;
		
		// int howmany = the int version of change divided by the new versions of the
		// dollars and coins
		
		int howManyTwenty = changeInt / twentyDollar;
		changeInt = changeInt % twentyDollar;
		if (howManyTwenty > 1 && twentyDollar % 2000 == changeInt) {
			System.out.print(howManyTwenty + " twenty dollar bills");
			howManyTwenty = 0;
		} if (howManyTwenty >= 1 && twentyDollar % 2000 == changeInt) {
				System.out.print(howManyTwenty + " twenty dollar bill");
				howManyTwenty = 0;
		} if (howManyTwenty > 1) {
			System.out.print(howManyTwenty + " twenty dollar bills, ");
		} else if (howManyTwenty >= 1) {
			System.out.print(howManyTwenty + " twenty dollar bill, ");
		}
		
		int howManyTen = changeInt / tenDollar;
		changeInt = changeInt % tenDollar;
		if (howManyTen > 1 && tenDollar % 1000 == changeInt) {
			System.out.print(howManyTen + " ten dollar bills");
			howManyTen = 0;
		} if (howManyTen >= 1 && tenDollar % 1000 == changeInt) {
				System.out.print(howManyTen + " ten dollar bill");
				howManyTen = 0;
		} if (howManyTen > 1) {
			System.out.print(howManyTen + " ten dollar bills, ");
		} else if (howManyTen >= 1) {
			System.out.print(howManyTen + " ten dollar bill, ");
		}
		
		int howManyFive = changeInt / fiveDollar;
		changeInt = changeInt % fiveDollar;
		
		if (howManyFive > 1 && fiveDollar % 500 == changeInt) {
			System.out.print(howManyFive + " five dollar bill");
			howManyFive = 0;
		} if (howManyFive >= 1 && fiveDollar % 500 == changeInt) {
				System.out.print(howManyFive + " five dollar bill");
				howManyFive = 0;
		} if (howManyFive > 1) {
			System.out.print(howManyFive + " five dollar bills, ");
		} else if (howManyFive >= 1) {
			System.out.print(howManyFive + " five dollar bill, ");
		}
		
		int howManyOne = changeInt / dollar;
		changeInt = changeInt % dollar;
		if (howManyOne > 1 && dollar % 100 == changeInt) {
			System.out.print(howManyOne + " one dollar bills");
			howManyOne = 0;	
		} if (howManyOne >= 1 && dollar % 100 == changeInt) {
			System.out.print(howManyOne + " one dollar bill");
			howManyOne = 0;
		} if (howManyOne > 1) {
			System.out.print(howManyOne + " one dollar bills, ");
		} else if (howManyOne >= 1) {
			System.out.print(howManyOne + " one dollar bill, ");
		}
		
		int howManyQuarter = changeInt / quarter;
		changeInt = changeInt % quarter;
		if (howManyQuarter > 1 && quarter % 25 == changeInt) {
			System.out.print(howManyQuarter + " quarters");
			howManyQuarter = 0;
		} if (howManyQuarter >= 1 && quarter % 25 == changeInt) {
			System.out.print(howManyQuarter + " quarter");
			howManyQuarter = 0;
		} if (howManyQuarter > 1) {
			System.out.print(howManyQuarter + " quarters, ");
		} else if (howManyQuarter >= 1) {
			System.out.print(howManyQuarter + " quarter, ");
		}
		
		int howManyDime = changeInt / dime;
		changeInt = changeInt % dime;
		if (howManyDime > 1 && dime % 10 == changeInt) {
			System.out.print(howManyDime + " dimes");
			howManyDime = 0;
		} if (howManyDime >= 1 && dime % 10 == changeInt) {
			System.out.print(howManyDime + " dime");
			howManyDime = 0;
		} if (howManyDime > 1) {
			System.out.print(howManyDime + " dimes, ");
		} else if (howManyDime >= 1) {
			System.out.println(howManyDime + " dime, ");
		}
		
		int howManyNickel = changeInt / nickel;
		changeInt = changeInt % nickel;
		if (howManyNickel > 1 && nickel % 5 == changeInt) {
			System.out.print(howManyNickel + " dimes");
			howManyNickel = 0;
		} if (howManyNickel >= 1 && nickel % 5 == changeInt) {
			System.out.print(howManyNickel + " nickel");
			howManyNickel = 0;
		} if (howManyNickel > 1) {
			System.out.print(howManyNickel + " nickels, ");
		} else if (howManyNickel >= 1) {
			System.out.print(howManyNickel + " nickel, ");
		}
		int howManyPenny = changeInt / penny;
		changeInt = changeInt % penny;
		if (howManyPenny == 1) {
			System.out.print(howManyPenny + " penny");
		} else if (howManyPenny > 1) {
			System.out.print(howManyPenny + " pennies");
		}
		System.out.print(".");
		System.out.print("\n" + "\n" + "-------*Your receipt is below*-------" + "\n"); 
		System.out.printf("\n" + "--Item price: " + "(" + "%.2f", costOfItem); 
		System.out.print(")");System.out.printf("\n" + "---You paid: " + "(" + "%.2f", tendered);
		System.out.println(")"); System.out.printf("--Your change: " + "(" + "%.2f", change); 
		System.out.println(")" + "\n" + "\n" + "           ---Thank you---");
	}
}


