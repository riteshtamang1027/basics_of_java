package recursion;

public class PrintSum {
    public static int printFactorial(int n){

        if(n == 0){

            return 1;

        } else if (n == 1) {
            return 1;

        }
 else {
            int fact =  printFactorial(n-1);

           int result = n * fact;

            return result;



        }


    }
    public static void naturalNumberSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        naturalNumberSum(i+1,n,sum);
        System.out.println(i);

    }

    static void main(String[] args) {
        System.out.println("The sum of Natural number is:");

//        naturalNumberSum(1,6,0);

        System.out.println(printFactorial(0));

    }
}
