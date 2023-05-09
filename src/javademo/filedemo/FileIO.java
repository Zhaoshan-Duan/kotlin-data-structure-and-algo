package javademo.filedemo;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        String[] names = {"Zhuzi", "Tiger", "Sleep"};

        try {
            // create writer object
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file...");
            writer.newLine();
            writer.write("Here is another line." + "\n");

            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
