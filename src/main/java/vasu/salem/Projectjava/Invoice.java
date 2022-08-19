package vasu.salem.Projectjava;

import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		Scanner invoice=new Scanner(System.in);
		Double amount=0.0,cGst=6.3,sGst=7.2,total=0.0;
				Float discount=9.8F;
		System.out.println("enter the amount");
		amount=invoice.nextDouble();
		cGst=amount*cGst/100;
		sGst=amount*sGst/100;
		Double totalGst=(cGst+sGst);
		total=(cGst+sGst)+amount;
	 discount=(float)(total*discount/100);
		

				System.out.println("the total amount is "+total+" the cGst is "+cGst+" the sGst is "+sGst+"the total GST is"+totalGst +"the food amount is without GST "+amount);
				System.out.println("the discount is"+discount);
		
	}

}
