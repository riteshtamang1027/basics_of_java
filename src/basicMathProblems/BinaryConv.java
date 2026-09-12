package basicMathProblems;

public class BinaryConv {
//    decimal to binary convertion
    static void decBin(int num) {
        int ans = 0, power = 1;
        while (num > 0){
            int reminder = num %2;

            ans = ans  + (reminder * power);

            power = power * 10;

            num /=2;
        }
        System.out.println(ans);
    }

//    binary to decimal
static void binDec(int num) {

        int ans = 0, pow = 1;
        while (num > 0){
            int reminder = num % 10;
            ans += reminder * pow;
            pow *=2;
            num /=10;
        }
    System.out.println(ans);

}
    public static void main(String[] args) {

        int decNum = 12;

        binDec(1110);


    }
}
