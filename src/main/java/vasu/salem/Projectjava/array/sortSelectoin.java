package vasu.salem.Projectjava.array;

import java.util.Arrays;

public class sortSelectoin {

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


    public void list(String[][] arr){
        for(String[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args) {
        String[][] looki = {{"karthi,thamidurai,biriyani"},
                {"vijay,th67,varisu"},
                {"vikram,suriya,dilli"},
                {"kamal,lokesh"}  };
        sortSelectoin rool=new sortSelectoin();
        rool.list(looki);
        rool.multiselection(looki);
    }

    private void multiselection(String[][] wet) {
        String third="";
        for (int row=0;row< wet.length;row++){
            for (int hold=0;hold<wet[row].length;hold++){
                for (int comp=hold+1;comp<wet[row].length;comp++){
                    if (wet[row][hold].compareToIgnoreCase(wet[row][hold])>0){
                        third=wet[row][hold];
                        wet[row][hold]=wet[row][comp];
                        wet[row][comp]=third;
                    }
                }
            }
        }

    }

    }

