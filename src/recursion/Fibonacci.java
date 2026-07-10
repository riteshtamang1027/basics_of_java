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

    static void main(String[] args) {

        int a=0, b=1, n=10;
        System.out.println(a);
        System.out.println(b);

        printFibonacci(a,b,n-2);

    }
}
