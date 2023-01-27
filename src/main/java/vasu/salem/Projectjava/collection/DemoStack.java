package vasu.salem.Projectjava.collection;

import java.util.Stack;

public class DemoStack {
        public static void main(String[] args) {
            Stack<String> crew=new Stack<String>();
            crew.push("Downey");crew.push("Pratt");
            crew.push("Hiddelston");crew.push("Downey");
            crew.push("Evans");
            System.out.println(crew);

            System.out.println(crew.search("Downey"));

            crew.pop();

            System.out.println(crew.search("Evans"));

            System.out.println(crew.peek());

            crew.clear();

            System.out.println(crew.size());
        }
    }


