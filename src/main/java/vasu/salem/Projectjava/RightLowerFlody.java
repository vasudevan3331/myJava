package vasu.salem.Projectjava;

import java.util.Scanner;

public class RightLowerFlody {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);			
		int book=0;
		System.out.println("tell how may Right lower floyd you want");
		book=scan.nextInt();
		for(int row=1;row<=book;row++) {
		for(int sml=book;sml>=row;sml--) {
		System.out.print(" ");
		}
		for(int col=book;col>=row;col--) {
			System.out.print("&");
		}
		System.out.println();
		}
		scan.close();
	}

}
