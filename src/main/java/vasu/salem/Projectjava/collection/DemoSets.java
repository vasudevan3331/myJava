package vasu.salem.Projectjava.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSets {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<Integer>();
        TreeSet<Integer> set2=new TreeSet<Integer>();

        set1.add(56);set1.add(11);set1.add(9);set1.add(44);set1.add(31);set1.add(4);
        set1.add(8);set1.add(10);set1.add(44);

        System.out.println("HashSet : "+set1);

        set2.addAll(set1);

        System.out.println("TreeSet : "+set2);

        set1.remove(31);
        set2.remove(11);

        System.out.println(set2.contains(31));
        System.out.println(set1.contains(11));

        //System.out.println("TreeSet : "+set2);

    }
}
