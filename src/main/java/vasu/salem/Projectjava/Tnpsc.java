package vasu.salem.Projectjava;

import java.util.Scanner;

public class Tnpsc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String work="";
		System.out.println("enter your qualification");
		work=scan.nextLine(); 
		if(work.equalsIgnoreCase("10")||work.equalsIgnoreCase("12"))
		{
			System.out.println(" you are eligible for TNPSC group 3 and group 4 exam ");
			}
		else if(work.equalsIgnoreCase("UG degree")||work.equalsIgnoreCase("PG degree"))
			{
				System.out.println("you are eligible for TNPSC all group Exams");
			}		
		
		else {
			System.out.println(" you are not eligible for the TNPSC group exam");
		}
		scan.close();
	}
	
}
