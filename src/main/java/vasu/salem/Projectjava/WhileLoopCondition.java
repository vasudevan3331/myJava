package vasu.salem.Projectjava;

import java.util.Scanner;

public class WhileLoopCondition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int balance=0, transactions=0;
		System.out.println("enter your accound balance ");
		balance=scan.nextInt();
		while(balance>0) {
			System.out.println(" the remaining value "+balance);
			System.out.println("enter your amount");
			balance-=scan.nextInt();
			transactions++;
	}
		System.out.println(transactions+" so far done");
	
		scan.close();
		}
	
}



