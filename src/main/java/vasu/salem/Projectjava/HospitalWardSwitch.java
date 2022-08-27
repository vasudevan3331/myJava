package vasu.salem.Projectjava;

import java.util.Scanner;

public class HospitalWardSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String choose="";
		System.out.println("wellcome to GH ");
		System.out.println("tell which ward do you want to go");
		choose=scan.nextLine();
		choose=choose.toLowerCase();
		switch(choose) {
		case "neurology" :System.out.println("The Neurology doctor in room no:12");break;
		case "psychiatrist" :System.out.println("The Psychiatrist doctor in room no:18");break;
		case "cardiology" :System.out.println("The Cardiology doctor in room no:10");break;
		case "rafiologist":case "General doctor": System.out.println("The doctor in room no:16");break;
		default:System.out.println("invalid category");
		}
		
	}

}
