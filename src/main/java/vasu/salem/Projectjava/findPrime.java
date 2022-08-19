package vasu.salem.Projectjava;

import java.util.Scanner;

public class findPrime {
	public static void main(String[] args) {
		Scanner find=new Scanner(System.in);
		System.out.println("Enter the number to find it's prime or not");
		Integer num=find.nextInt();
		System.out.println("the number is "+num+" prime?"+(num==2||num==3||num==5||num==7||num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0));
		
		find.close();
	}

}
