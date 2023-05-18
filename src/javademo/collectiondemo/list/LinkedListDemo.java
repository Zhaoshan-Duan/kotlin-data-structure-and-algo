package javastuff.collectiondemo.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}