//Jason Graves
//Asignment 4 Vickie Vegas
//1/16/2020
//


import java.util.*;
public class testClass {
	public static void main(String[] args) {
		int plays1 = 0, plays2 = 0, plays3 = 0;	
		for(int q=100; q>0;) {
		//the three machines are called here, before every play it checks to see if she has any quarters
		//it is also keeping track of how many times she plays each machine
		if (q > 0) {
		q = q + slot1(q);
		plays1++;
		}
		if (q > 0) {
		q = q + slot2(q);
		plays2++;
		}
		if (q > 0) {
		q = q + slot3(q);
		plays3++;
		}
		//every time she goes through all three machines, it displays how many quarters she has left
		System.out.println("Vickie has played all three and has " + q + " quarters left.");
		}
		//this displays when she runs out of money
		System.out.println("Aunt Vickie is now out of quarters");
		System.out.println("She was able to play machine 1 " + plays1 + " times. Machine 2 " + plays2 + " times. And machine 3 " + plays3 + " times.");
	}
	public static int slot1(int q) {
		//slot machine 1
		Random machine = new Random();
		int number;
		number = machine.nextInt(35);
		if (number == 0) {
			//using a random number generator, whenever it comes up 0 she wins 
			//this displays that she won, how many quarters she has left, and it calls the money conversion method
			System.out.println("WINNER ON MACHINE 1 + 25 QUARTERS");
			q = q+24;
			dollarncents(q);
			//the return amount is added to the running total in main 
			//NOTE that the return amount is 1 less than how much she won, that is because it still costs 1 quarter to play
			return 24;
		}
			return -1;
	}
	public static int slot2(int q) {
		//slot machine 2
		Random machine = new Random();
		int number;
		number = machine.nextInt(100);
		if (number == 0) {
			System.out.println("WINNER ON MACHINE 2 + 75 QUARTERS");
			q = q+74;
			dollarncents(q);
			return 74;
		}
			return -1;
	}
	public static int slot3(int q) {
		//slot machine 3
		Random machine = new Random();
		int number;
		number = machine.nextInt(8);
		if (number == 0) {
			System.out.println("WINNER ON MACHINE 3 + 5 QUARTERS");
			q = q+4;
			dollarncents(q);
			return 4;
		}
			return -1;
	}
	public static void dollarncents(int q) {
		//converts quarters into dollars and cents
		double money;
		money = q * 0.25;
		System.out.print("Vickie now has " + q + " quarters, which is ");
		System.out.printf("$%.2f\n", money);
	}
	}

