package vasu.salem.Projectjava;

import java.util.Scanner;

 

public class GenderFind {
	public static void main(String[] args) {
		Scanner gender=new Scanner(System.in);
		String choose="";
		//choose=male(or)female
		System.out.println("tell your gender");
		choose=gender.next();
		System.out.println("the gender is for eligible for scheme "+(choose.compareTo("female")==0));
		gender.close();
	}

}
