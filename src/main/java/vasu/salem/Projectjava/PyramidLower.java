package vasu.salem.Projectjava;

import java.util.Scanner;

public class PyramidLower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int speed=0, time=0;
		System.out.println("Tell us how many pyramid do you want ");
		speed=scan.nextInt();
		time=speed*2-1;
		for(int row=speed;row>0;row--) {
			for(int space=speed;space>row;space--) {
				System.out.print(" ");
			}
			for(int data=1;data<=time;data++) {
				System.out.print("#");
			}
			System.out.println();
			time-=2;
		}
		
scan.close();
}
}