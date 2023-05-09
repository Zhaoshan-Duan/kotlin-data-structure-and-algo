package javademo.filedemo;

import java.io.*;
import java.util.ArrayList;

public class WriteStudents {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("John", 1, "111 NE Road", "Hayward"));
        list.add(new Student("Carl", 2, "213 Main Street", "Senoia"));
        list.add(new Student("Jeff", 3, "410 Terry Ave N", "Seattle"));

        try {
            PrintWriter writer = new PrintWriter("students.txt");

            for (Student s : list) {
                writer.println(s.name + ':' + s.enrollmentId + ' ' + s.address + ' ' + s.city);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
