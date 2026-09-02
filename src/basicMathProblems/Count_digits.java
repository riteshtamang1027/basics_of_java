// Count the number of digits in a number.

import java.util.Scanner;
public class Count_digits {

    public static int count_digit(int number){
        int count = 0;

        while (number > 0){
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter more then 1 digit number: ");
        number = sc.nextInt();


        System.out.println("The number of digits is "+count_digit(number));
    }

}
