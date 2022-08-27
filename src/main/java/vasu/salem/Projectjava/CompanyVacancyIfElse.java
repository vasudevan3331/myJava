package vasu.salem.Projectjava;

import java.util.Scanner;

public class CompanyVacancyIfElse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String skill="";float salary=0.0F;
		System.out.println(" enter your skill");
		skill=scan.next();
		if(skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("spring")||
				skill.equalsIgnoreCase("hyper net")) {
			System.out.println("back end devloper job is available");
			salary=4.5F;
			System.out.println("your salary is "+salary);
			
		}
			else if(skill.equalsIgnoreCase("react")||
					skill.equalsIgnoreCase("php")||
					skill.equalsIgnoreCase("anguler")) {
				System.out.println("front end devloper job is available");
				salary=3.8F;
				System.out.println("your salary is "+salary);
						
	}
			else if   (skill.equalsIgnoreCase("Django")||
					skill.equalsIgnoreCase(".net")||
					skill.equalsIgnoreCase("servelent")) {
				System.out.println("web devloper job is available");
				salary=2.6F;
				System.out.println("your salary is "+salary);
				
			}
			else if (skill.equalsIgnoreCase("swift")||skill.equalsIgnoreCase("c")||
					skill.equalsIgnoreCase("android")) {
				System.out.println("app devloper job is available");
				salary=3.2F;
				System.out.println("your salary is "+salary);
				
			}
			else {System.out.println("invaild data");
			
			}
		
scan.close();

	}
	}

