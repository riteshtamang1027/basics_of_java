package recursion;

public class Fibonacci {

    public static void printFibonacci(int n1, int n2, int i){

if(i == 0){
    return;
}

        int c = n1 + n2;
        System.out.println(c);

        printFibonacci(n2, c, i -1);

    }


//    using for lop to print the power of a number;
    static void power(int bas, int pow){
        System.out.println("Calculate the power of a number using for loop:");
        int res=1;
        for(int i = 0; i< pow; i++){
            res *= bas;
        }
        System.out.println(res);
    }

//    print the power of a number using recursion;
    public static int printPowerOfNumber(int a, int n){

        if(n == 0){

            return 1;
        } else if (a == 0) {

            return 0;
        }

        int pow1 = printPowerOfNumber(a, n-1);
       int res = a * pow1;
       return  res;


    }

    static void main(String[] args) {

        int a=0, b=1, n=10;
        System.out.println(a);
        System.out.println(b);

//        printFibonacci(a,b,n-2);l
        System.out.println("Calculate the power of a number using recursion:");
        System.out.println(printPowerOfNumber(2,5));
        power(2,5);

    }
}
