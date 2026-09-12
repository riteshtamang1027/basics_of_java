package basicMathProblems;

public class PowTwo {
    static void main(String[] args) {

        int num = 150, pow = 1;
        int original = num;
        while (original > 1){
            original /=2;
            pow *= 2;
        }
        if (pow == num){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
