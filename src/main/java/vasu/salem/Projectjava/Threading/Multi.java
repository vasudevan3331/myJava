package vasu.salem.Projectjava.Threading;

import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public void main(String[] args) {

        Final fin=new Final();
        //Shine sh=new Shine();


        Thread t1=new Thread(fin,"Evans");
       // Thread t2=new Thread(sh,"Scarlet");
        Thread t3=new Thread(fin,"Barton");
        Thread t4=new Thread(fin,"Odin");

        t1.start();
       // t2.start();
        t3.start();
        t4.start();
    }

    class Tony {
        Scanner scan = new Scanner(System.in);
        double[][] arr = {{1.2, 1.3, 1.4}, {2.1, 2.2, 2.3, 2.4}, {3.1, 3.2, 3.3, 3.4}};

        public void list() {
            for (double[] one : arr) {
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    class Final extends Tony implements Runnable {
        String traverse;

        public void spiralTowardsOut() {
            int row = 0, col = 0;
            row = 1;
            col = arr[row].length - 2;
            while (col > 0) {
                System.out.println(arr[row][col] + "");
                col--;

            }
            col++;
            row++;
            while (col < arr[row].length) {
                System.out.print(arr[row][col] + " ");
                col++;
            }
            col--;
            row--;
            while (row >= 0) {
                System.out.print(arr[row][col] + " ");
                row--;
            }
            row++;
            col--;
            while (col >= 0) {
                System.out.print(arr[row][col] + " ");
                col--;
            }
        }

        @Override
        synchronized public void run() {
            System.out.println(Thread.currentThread().getName() + " tell us how to traverse ");
            traverse = scan.next();
            switch (traverse) {
                case "spiout":
                    spiralTowardsOut();
                    break;
                //  case "spin":spiralTowardsIn();break;
                case "basic":
                    list();
                    break;
                default:
                    System.out.println(traverse + " invalid");
            }
        }

         class Shine extends Tony implements Runnable {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int row = 0; row < arr.length; row++) {
                    double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
                    for (int col = 0; col < arr[row].length; col++) {
                        if (min > arr[row][col]) {
                            min = arr[row][col];
                        }
                        if (max < arr[row][col]) {
                            max = arr[row][col];
                        }
                    }
                    System.out.println(min + " is minimum in the row of " + row);
                    System.out.println(max + " is maximum in the row of " + row);
                }

            }
        }
    }
}


