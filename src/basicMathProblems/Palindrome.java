//Check whether a number is a palindrome.

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number, reminder, reverse=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any more than 2 digits number: ");

        number = sc.nextInt();

        int original = number;

        while (number > 0){
            reminder = number %10;

            reverse = reverse * 10 + reminder;

            number /=10;

        }

        if (original==reverse){
            System.out.println("The input number "+ original+" is Palindrome.");
        }
        else {
            System.out.println("The input number "+ original+" is not a palindrome.");
        }
    }
}
