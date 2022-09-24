package vasu.salem.Projectjava;

import java.util.Scanner;

public class RightUpperFloyed {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int road=0;
		System.out.println("tell how may Right upper floyd you want");
		road=scan.nextInt();
		for(int row=1;row<=road;row++) {
			for(int find=road;find>=row;find--) {
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++) {
			System.out.print("#");
		}
		System.out.println();
	}
	}
}


