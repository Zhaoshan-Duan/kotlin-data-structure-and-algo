package javademo.collectiondemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}