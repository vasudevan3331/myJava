package vasu.salem.Projectjava.collection;

import java.util.*;

public class DemoMaps {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm=new Hashtable<>();
        hm.put(766,"vasudevan");hm.put(-1,"arun");
        hm.put(890,"praveen");hm.put(900,"anand Kumar");

        System.out.println(hm);

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.putAll(hm);

        System.out.println(tm);

        Set<Integer> st=tm.keySet();
        Iterator<Integer> t=st.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }

        Collection<String> cc=hm.values();
        Iterator<String> c=cc.iterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }

//        for(Integer k:tm.keySet()){
//            System.out.println(k+" "+tm.get(k));
//        }
//
//        for(String v:hm.values()){
//            System.out.println(v);
//        }

        tm.remove(890);

        System.out.println(hm.containsValue("vijay"));
        System.out.println(tm.containsKey(890));

    }
}
