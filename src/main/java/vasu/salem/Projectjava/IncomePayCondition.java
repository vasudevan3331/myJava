package vasu.salem.Projectjava;

import java.util.Scanner;

public class IncomePayCondition {
	public static void main(String[] args) {
		Scanner income=new Scanner(System.in);
		double salary=0;
		System.out.println("enter the annual income");
		salary=income.nextDouble();
		System.out.println("you dont want to the pay tax  "+(salary<2.5));
		System.out.println("you should pay the tax  "+(salary>=2.5));
		income.close();
		
		
	}
}

	


