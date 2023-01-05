package vasu.salem.Projectjava.oop;

import lombok.Data;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
//        Store st=new Store();
//        st.convert();
//        System.out.println(Arrays.toString(st.getSin()));
//        Provisionery pro=new Provisionery();
//        pro.convert();
//        System.out.println(Arrays.toString(pro.getSpiral()));
//        System.out.println(Arrays.toString(pro.getSin()));

//        Mart mart=new Mart();mart.convert();
//        System.out.println(Arrays.toString(mart.getDiag()));
//        System.out.println(Arrays.toString(mart.getSin()));

        // factory pattern
        Store st=new Provisionery();
        st.convert();
        System.out.println(Arrays.toString(st.getSin()));

        st=new Mart();
        st.convert();
        System.out.println(Arrays.toString(st.getSin()));
    }
}

@Data
class Mart extends Store{
    private int[] diag=new int[getArr().length*getArr()[0].length];
    public void convert(){
        System.out.println("Mart convert");
        int row=0,col=0,index=0;
        for(;row<getArr().length&&col<getArr()[row].length;row++,col++,index++){
            diag[index]=getArr()[row][col];
        }
        row=0;col--;
        for(;row<getArr().length&&col>=0;row++,col--,index++){
            if(row==1&&col==1) {
                index--;
                continue;
            }
            diag[index]=getArr()[row][col];
        }
        System.out.println(index+" "+diag[4]);
        row=0;col=1;
        diag[index]=getArr()[row][col];
        index++;
        diag[index]=getArr()[col][row];
        row++;col++;index++;
        diag[index]=getArr()[row][col];
        index++;
        diag[index]=getArr()[col][row];
        super.convert();
    }
}

@Data
class Provisionery extends Store{
    private int[] spiral=new int[getArr().length*getArr()[0].length];
    public void convert(){
        int row=0,col=0,index=0;
        while(col<getArr()[row].length){
            spiral[index]=getArr()[row][col];
            col++;index++;
        }
        col--;row++;
        while(row<getArr().length){
            spiral[index]=getArr()[row][col];
            row++;index++;
        }
        col--;row--;
        while(col>=0){
            spiral[index]=getArr()[row][col];
            col--;index++;
        }
        col++;row--;
        while(col<2){
            spiral[index]=getArr()[row][col];
            col++;index++;
        }
        super.convert();
    }
}

@Data
class Store{
    private int[][] arr={{14,32,26},{12,64,27},{36,122,65}};
    private int[] sin=new int[arr.length*arr[0].length];
    public void convert(){
        int index=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++,index++){
                sin[index]=arr[row][col];
            }
        }
    }
}

