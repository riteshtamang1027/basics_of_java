import java.util.Scanner;

public class Sum_of_Factorial {
    public static void sum(int number) {
        int i, reminder, total = 0;

        while (number > 0) {

            reminder = number % 10;

            int factorial = 1;

            for ( i = 1; i <= reminder; i++){
                factorial *= i;
            }

            total += factorial;

            number /= 10;

        }

        System.out.println("The sum of factorial of digit is "+total);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");

        number = sc.nextInt();

//      function call

        sum(number);

    }
}
