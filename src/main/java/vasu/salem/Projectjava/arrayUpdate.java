package vasu.salem.Projectjava;

import java.util.Arrays;
import java.util.Scanner;

public class arrayUpdate {

    public void good(int[] arr,int start,int end) {

//        if (start>=0&&start<=end&&end<arr.length){
//            for (;start<=end;start++){
//                System.out.println(arr[start]);
//            }
//        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] <= 40) {
                arr[index] += 11;
            }
            else
                arr[index] += 3;
        }
    }

    public static void main(String[] args) {
        arrayUpdate fd=new arrayUpdate();
        int[] fees={62,24,56,78,93,81,12};
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the start and end pos");
        fd.good(fees,scan.nextInt(),scan.nextInt());
        System.out.println(Arrays.toString(fees));


    }
}
