package basicMathProblems;

public class BinaryConv {
    public static void main(String[] args) {

        int decNum = 12, ans = 0, power = 1;

        while (decNum > 0){
            int reminder = decNum %2;

            ans = ans  + (reminder * power);

            power = power * 10;

            decNum /=2;
        }
        System.out.println(ans);

    }
}
