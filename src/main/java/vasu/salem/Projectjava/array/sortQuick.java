package vasu.salem.Projectjava.array;

import java.util.Arrays;

public class sortQuick {
    public int sort(String[][] arr,int row,int start,int end){
        String piData=arr[row][end];
        int initial=start-1;

        for(int current=start;current<end;current++){
            if(arr[row][current].compareTo(piData)<0){
                initial++;
                String tmp=arr[row][initial];
                arr[row][initial]=arr[row][current];
                arr[row][current]=tmp;
            }
        }

        String tmp=arr[row][initial+1];
        arr[row][initial+1]=arr[row][end];
        arr[row][end]=tmp;

        return initial+1;
    }

    public void divide(String[][] arr,int row,int start, int end){
        if(row<arr.length){
            if(start<=end){
                int piPoint=sort(arr,row,start,end);
                divide(arr,row,start,piPoint-1);
                divide(arr,row,piPoint+1,end);
            }
            else {
                row++;
                if(row<arr.length){
                    divide(arr,row,0,arr[row].length-1);
                }
            }
        }
    }

    public void list(String[][] arr){
        for(String[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        String[][] cast={
                {"Vijay","Ravikumar","Karthisiva"},
                {"Krishan","Aishwarya","Rio"},
                {"Jeyamravi","Ladack","Prabudeva"},
                {"Prakashraj","Naveenraj"}
        };
        sortQuick multi=new sortQuick();
        multi.list(cast);
        multi.divide(cast,0,0,cast[0].length-1);
        multi.list(cast);
    }
}


