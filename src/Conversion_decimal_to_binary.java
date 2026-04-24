public class Conversion_decimal_to_binary {
    public static void main(String[] args) {

        int num = 4;
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;  // prepend
            num = num / 2;
        }

        System.out.println("Binary: " + binary);
    }
}
