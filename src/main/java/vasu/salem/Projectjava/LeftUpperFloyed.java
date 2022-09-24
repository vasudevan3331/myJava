package vasu.salem.Projectjava;

import java.util.Scanner;

public class LeftUpperFloyed {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int game=0;
		System.out.println("tell how may lower floyd you want");
		game=scan.nextInt();
		for(int row=1;row<=game;row++) {

		for(int col=1;col<=row;col++) {
			System.out.print("#");
		}
		System.out.println();
		
		
		
		
		
		scan.close();
		
	}

	}
}