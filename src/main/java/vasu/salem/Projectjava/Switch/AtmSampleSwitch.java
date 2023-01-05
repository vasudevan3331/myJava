package vasu.salem.Projectjava.Switch;

import java.util.Scanner;

public class AtmSampleSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
			char option='\0';int balance=0,amount=0,pin=0;String check="";
				System.out.println("wellcome to the salem bank");
				System.out.println("enter your account balanace");
				balance=scan.nextInt();
				System.out.println("enter the code to access your work");
				option=scan.next().charAt(0);
			switch(option) {
				case 'w':		
					System.out.println("enter your amount");
					amount=scan.nextInt();
					if (amount<=balance) {
						balance-=amount;
						System.out.println("collect your amount "+amount);
					}
					else {
						System.out.println("insufficent balance");
					}
					
					
					
						break;
					
				case 'd' :
					System.out.println("inset your money to depost");
					amount=scan.nextInt();
				    balance+=amount;
				    System.out.println("your amount has be deposited "+balance);
				     break;
				case 'b' :System.out.println("your balance is "+balance);break;
				default:System.out.println("invalid code");
				
				
				
				}
				scan.close();
				
			}
	}


