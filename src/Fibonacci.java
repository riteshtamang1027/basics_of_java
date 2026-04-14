import java.util.Scanner;

public class Fibonacci {

//    fibonacci series logic using recursive
    public static int fibonacci_series(int n){
        if (n <=1){
            return n;
        }
        else {
            return fibonacci_series(n-1)+fibonacci_series(n-2);
        }
    }

//    printing Fibonacci series
    public static void print_series(int n){
        System.out.println("----- Here is a Fibonacci Series using Recursive function -----");

        for( int i=0;i<n;i++){
            System.out.println(fibonacci_series(i));
        }
        System.out.println("----------------------------------------------------------------");
    }

//   using simple method to show fibonacci series

    public static void simple_fibo(int number){
        int a=0, b=1, sum=0;
        System.out.println("----- Fibonacci Series using simple method -----");
        System.out.println(a);
        System.out.println(b);

        for (int i = 1;i<=number - 2; i++){
            sum = a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
        System.out.println("-----------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
//        get user input
        System.out.print("Enter how many Fibonacci series you want to print: ");
        number = sc.nextInt();

//        printing function call
        print_series(number);

        simple_fibo(number);
    }

}