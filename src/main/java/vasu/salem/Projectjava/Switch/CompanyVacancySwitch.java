package vasu.salem.Projectjava.Switch;

import java.util.Scanner;

public class CompanyVacancySwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String skill="";double salary=0.0;
		System.out.println("Enter your skill  ");
		skill=scan.nextLine();
		skill=skill.toLowerCase();
		switch(skill) {
		case "java" :case "spring" :case "hyper net":System.out.println(" backend Developer job avaliable");
			salary=4.5;
			System.out.println("your salary is "+salary);break;
		case "php" :case "angular" :case "react js" :System.out.println(" forntend Developer job avaliable ");
			salary=3.8;
			System.out.println("your salary is "+salary);break;
		case "django" :case "servelent" :case ".net" :System.out.println(" web Developer job avaliable ");
			salary=2.6;
			System.out.println("your salary is "+salary);break;
		case "swift" :case "android" :case "c": case "c++" :System.out.println(" app Developer job avaliable");
			salary=3.2;
			System.out.println("your salary is "+salary);break;
		default:System.out.println("invalid data");
		
		}
		scan.close();
	}

}
