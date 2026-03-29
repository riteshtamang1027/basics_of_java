
//Find the sum of digits of a number.

import java.util.Scanner;

public class Digits_sum {
//    Sum of the digits
    public static void sum(int number){
        int reminder, sum = 0;
        int num = number;
        while(number > 0){
            reminder = number %10;
            sum = sum + reminder;
            number /=10;
        }
        System.out.printf("The sum of given digit %d is: %d \n",num, sum);

    }

//    product of the digits
    public static void product(int number){
        int reminder, mul = 1;
        int num = number;
        while (number > 0){
            reminder = number%10;
            mul = mul * reminder;
            number /=10;
        }
        System.out.printf("The product of the digit %d is: %d \n",num, mul);

    }

  public  static void main(String[] args) {
      int num;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter any two digit number: ");

      num = sc.nextInt();

sum(num);
product(num);

    }

}
