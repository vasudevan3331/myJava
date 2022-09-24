package vasu.salem.Projectjava;

import java.util.Scanner;

public class LeftLowerFloyed {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.println("Tell  how many rows&col ");
		count=scan.nextInt();
		
		for(int row=1;row<=count;row++) {

			for(int col=count;col>=row;col--) {
				System.out.print("$");
			}
			System.out.println();
	
		}
		scan.close();
	}
	
	}


