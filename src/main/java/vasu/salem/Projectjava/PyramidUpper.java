package vasu.salem.Projectjava;

import java.util.Scanner;

public class PyramidUpper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int count=0, limit=1;
		System.out.println("Tell us how many rows ");
		count=scan.nextInt();
		
		for(int row=1;row<=count;row++) {
			for(int space=count;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++) {
				System.out.print("#");
			}
			System.out.println();
			limit+=2;
	}
scan.close();
}
}