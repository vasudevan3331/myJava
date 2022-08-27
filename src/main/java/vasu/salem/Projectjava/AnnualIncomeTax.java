package vasu.salem.Projectjava;

import java.util.Scanner;

public class AnnualIncomeTax {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double income=0.0,balance=0.0,tax=0.0;
		System.out.println("Enter your Annual Income");
		income=scan.nextDouble();
		if(income>=2.5&&income<=5.0) {System.out.println("you should pay 5% tax for the income");
		tax=5.0;
		}
		else if(income<2.5) {System.out.println("you don't want to pay the tax");
		}
		else if(income>5.0&&income<=10.0) {System.out.println("you should pay 10% tax for the income");
	tax=10.0;
		}
		else if(income>10.0&&income<=20.0) {System.out.println("you should pay 20% tax for the income ");	
		tax=20.0;
		}
		else if (income>20.0&&income<=25.0) {System.out.println("you should pay 25% tax for the income");
		tax=25.0;
		}
		else if (income>=30.0) {System.out.println("above3 30 LPA you should pay 30% tax for the income");
		tax=30.0;
		}
		else {System.out.println("invalid code");
		}
		balance=income-(income*tax)/100;
		System.out.println("your annual income is "+income+" and your tax of the annual income is "+tax+" and your total balance is "+balance);
		scan.close();
		}
	}
	
