package vasu.salem.Projectjava;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int game=0;
		System.out.println("enter the account balance");
		game=scan.nextInt();
		
		do {
				System.out.println(" the remaining value "+game);
				System.out.println("enter your amount");
				game-=scan.nextInt();
					
		}while(game>=0);
		
		
		
		
		scan.close();
	}

}
