package vasu.salem.Projectjava;

import java.util.Scanner;

public class LaptopBuying {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char rool='\0';String fire="";int goal=0;
		System.out.println("Enter your proccer");
		rool=scan.next().charAt(0);
		switch(rool) {
		case 'a':System.out.println("a brand avaliable");break;
		case 'i':System.out.println("i brand avaliable");
		System.out.println("enter your budget");
		goal=scan.nextInt();
		if(goal>=20000&&goal<=40000) {
			System.out.println("there have lenovo,acer available");	}
		
		else if(goal>40000&&goal<=60000) {
			System.out.println("there have HP,dell avaliable");
		  
			System.out.println("select your brand");
			fire=scan.next();
			
			if(fire.equalsIgnoreCase("hp")) {
			System.out.println("here the result");
			System.out.println("select your amount to buy");
			goal=scan.nextInt();
			switch(goal) {
			case 39123:
				System.out.println("successfully buyed");break;
			case 38241:
				System.out.println("successfully buyed");break;
			case 33386:
				System.out.println("successfully buyed");break;
			
			}
			}
			else if(fire.equalsIgnoreCase("dell")) {
				System.out.println("here the result");
				System.out.println("select your amount to buy");
				goal=scan.nextInt();
				switch(goal) {
				case 39123:
					System.out.println("successfully buyed");break;
				case 38241:
					System.out.println("successfully buyed");break;
				case 33386:
					System.out.println("successfully buyed");break;
				
				}
			}
			
			else {
				System.out.println("the not avaliable");
			}
		}
		else if(goal>60000) {
			System.out.println("there have dell and Apple avaliable");	
		}
		
		else {
		System.out.println("invalide amount");
		}
			
	}
	
		scan.close();
		}	
          }


