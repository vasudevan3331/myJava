package vasu.salem.Projectjava;

import java.util.Scanner;

public class RailTicketBookingTask {
	public static void main(String[] args) {
		Scanner firstTask=new Scanner(System.in);
		System.out.println("wellcome to train ticket booking center ");
		System.out.println("enter your name");
		String name=firstTask.nextLine();
		
		System.out.println("enter the train name");
		String trainName=firstTask.nextLine();
		
		System.out.println("enter the train number");
		Integer trainNumber=firstTask.nextInt();
		
		System.out.println("enter the date of booking");
		String date=firstTask.next();
		
		System.out.println("train time");
		Double trainTime=firstTask.nextDouble();
		
		System.out.println("enter the proof(aadhar)");
		long proof=firstTask.nextLong();
		
		System.out.println("mobile number");
		Long number=firstTask.nextLong();
		
		System.out.println("address");
		String address=firstTask.next();
		
		System.out.println("Thank you for filled the above task  " +name+ " your train name is "+trainName+" and the train Number is " +trainNumber+ "and the date of booking"  +date+ "time is" +trainTime+ "the train booking id and ticket number will sent to your mobile number" +number);
		System.out.println("happy journey enjoy your trip");
		firstTask.close();
	}

}
