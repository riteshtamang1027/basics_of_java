//Write a program to find the remainder when one number is divided by another.
import java.util.Scanner;
public class Remainder {

    static void main(String[] args) {

        int num1, num2, remainder;
        Scanner nu = new Scanner(System.in);
        System.out.println("Entering the first number is must be greater than second one.");

        System.out.print("Enter first number: ");
        num1 = nu.nextInt();

        System.out.print("Enter second number: ");
        num2 = nu.nextInt();

        remainder = num1 % num2;

        if( remainder == 0){
            System.out.println("The remainder is "+remainder);
        }
        else {
            System.out.println("The remainder is "+remainder);
        }
    }

}
