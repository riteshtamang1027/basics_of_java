import java.util.Scanner;

public class Factorial {


    public static int factorial_of_number(int n, int facto){
//    int facto;
        if (n == 0){
            return 1;
        }

        while (n >=1){
            facto = facto * n;
            n--;
        }
        return facto;

    }

    static void main(String[] args) {
        int number, factorial=1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer number: ");

        number = sc.nextInt();

     int result =   factorial_of_number(number, factorial);
        System.out.println("The factorial of "+ number+ " is "+ result);


    }
}
