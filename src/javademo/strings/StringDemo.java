package javastuff.strings;

public class StringDemo {

    public static void main(String[] args) {

        String s = "New String";
        concatString(s);
        System.out.println("String created using string class is:" + s);

        StringBuilder sb = new StringBuilder("New String");

        concatStringBuilder(sb);
        System.out.println("String created using string class is:" + sb);

        StringBuffer sbr = new StringBuffer("New String");
        concatStringBuffer(sbr);
        System.out.println("String created using string class is:" + sbr);

    }

    public static void concatString(String s1) {
        s1 = s1 + "with String class";
    }

    public static void concatStringBuilder(StringBuilder s2) {
        s2.append("with String Builder");
    }
    public static void concatStringBuffer(StringBuffer s3) {
        s3.append("with String Buffer");
    }

}

