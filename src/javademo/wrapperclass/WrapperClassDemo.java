package javademo.wrapperclass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        String str = "123";

        Integer i = Integer.parseInt(str);

        String backToStr = i.toString();

        int p = 123;

        Double pInt = Double.valueOf(p);

        int p1 = pInt.intValue();
    }
}
