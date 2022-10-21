package vasu.salem.Projectjava;

import java.util.Scanner;

public class arrayInsert {
    public static void main(String[] args) {
        String bts[]=new String[7];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the starting number");
        int start=scan.nextInt();
        System.out.println("enter the end number ");
        int end =scan.nextInt();



        for (int pos=start;pos<end;pos++){
            System.out.println("the value of the pos  "+pos);
            bts[pos]=scan.next();
        }
        System.out.println(bts[6]);
    }
}
