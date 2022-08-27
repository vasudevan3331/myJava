package vasu.salem.Projectjava;

import java.util.Scanner;

public class ThirupatiEntry{ 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean choose=true;int count=0;String person="";
		System.out.println("wellcome to Thirupathi temple \n enter your name");
		person=scan.nextLine();
		System.out.println("tell you vaccanated are not");
		choose=scan.nextBoolean();
		if(choose) {
		 System.out.println("wellcome to thirupathi");
		System.out.println("tell how many dose you vaccanated");
		count=scan.nextInt();
		if(count==1) {
			System.out.println("you are eligible for normal tharisanam");
		}
		else if(count==2) {
		System.out.println("you eleigible for VIP tharisanam");
		}
		else {
			System.out.println("thrisanam not allowed");
		}
		}
		
	

		
		else {
			System.out.println("your are not allow to the temple");
		}
		
		
	}		
}



