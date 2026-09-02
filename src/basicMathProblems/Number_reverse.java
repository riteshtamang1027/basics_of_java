//	Reverse a number.
import java.util.Scanner;

public class Number_reverse {

    public static void reverse (){
        int number, reminder;
        int sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number more than 2 digits: ");

        number = sc.nextInt();

        while (number > 0) {
            reminder = number % 10;
            sum = sum * 10 + reminder;
            number /= 10;
        }
        System.out.println("The reverse number is");
        System.out.println(sum);

    }

    static void main(String[] args) {
        reverse();
    }
}
