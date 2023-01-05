package vasu.salem.Projectjava.oop;

import lombok.Data;

import java.util.Arrays;
public class DemoHierarchy extends Wink {
    //    public void findMin(String[] arr){
//        String min=arr[0];
//        for(int index=0;index<arr.length;index++){
//            if(arr[index].compareTo(min)<0){
//                min=arr[index];
//            }
//        }
//        System.out.println("Min value is "+min);
//    }
    public void findMin() {
        String min = getArr()[0];
        for (int index = 0; index < getArr().length; index++) {
            if (getArr()[index].compareTo(min) < 0) {
                min = getArr()[index];
            }
        }
        System.out.println("Min value is " + min);
    }

    public static void main(String[] args) {
        king w=new king();
        //DemoSingle demo=new DemoSingle();
        //demo.findMin(w.getArr());

        DemoSingle demo = new DemoSingle();
        w.list();
    }
}

@Data
class king {
    private String[][] god = {{"realme","redmi","oppo","vivo","reno","samsung"},{"hp","dell","asus","msi"}};

    public void list() {
        System.out.println(Arrays.toString(god));
    }
}



