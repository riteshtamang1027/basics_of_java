package recursion;

public class Factorial {

    public static int factorial_of_N(int n){

        if (n==0){
            return 1;
        }

      return n * factorial_of_N(n-1);
    }

   public static void main(String[] args) {
     int  result = factorial_of_N(4);
       System.out.println(result);


    }
}
