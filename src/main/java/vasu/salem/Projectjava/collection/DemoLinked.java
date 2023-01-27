package vasu.salem.Projectjava.collection;

import java.util.LinkedList;

public class DemoLinked {
    public static void main(String[] args) {
        LinkedList<Double> link1=new LinkedList<Double>();
        link1.add(4.5);link1.addLast(11.5);link1.add(5.6);link1.addFirst(9.34);
        link1.add(56.8);link1.add(8.1);link1.add(2,2.2);
        System.out.println(link1);
        link1.set(4,9.9);
        System.out.println(link1);
        link1.remove(5.6);
        link1.remove();
        link1.remove(2);
        link1.removeLast();

        System.out.println(link1.getFirst());
        System.out.println(link1.getLast());
        System.out.println(link1.get(2));
    }
}

