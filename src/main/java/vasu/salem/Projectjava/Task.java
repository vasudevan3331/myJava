package vasu.salem.Projectjava;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner bioData=new Scanner(System.in);
		System.out.println("Enter the biodata");
		
		
		System.out.println("enter the name");
		String name=bioData.nextLine();
		
		System.out.println("enter the collage name");
		String collageName=bioData.nextLine();
		
		System.out.println("enter the place");
		String place=bioData.nextLine();
		
		System.out.println("enter the roll no");
		Long rollNo=bioData.nextLong();
		
		System.out.println("enter the pincode");
		Integer pincode=bioData.nextInt();
		System.out.println("the name is  "+name+" the roll no is "+rollNo+" your place is "+place+"collage name is "+collageName+" the pincode "+pincode);
		
		bioData.close();
	}

}
