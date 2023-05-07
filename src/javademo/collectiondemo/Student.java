package javademo.collectiondemo;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable {
    public String lastName;
    public String firstName;

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
