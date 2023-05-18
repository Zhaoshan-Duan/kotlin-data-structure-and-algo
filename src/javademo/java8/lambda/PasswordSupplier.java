package javastuff.java8.lambda;

import java.util.function.Supplier;

public class PasswordSupplier {
    public static void main(String[] args) {
        Supplier<String> otpGenerator = () -> {

            StringBuilder otp = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                otp.append((int) (Math.random() * 10));
            }
            return String.valueOf(otp);
        };

        System.out.println(otpGenerator.get());
    }
}
