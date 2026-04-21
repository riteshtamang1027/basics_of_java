public class Toggle_bit {
    public static void main(String[] args) {
        int number = 5;
        int pos=1;

        int bitMask = number ^ (1 << pos);
        System.out.println(bitMask);

    }
}
