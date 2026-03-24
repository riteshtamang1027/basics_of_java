import java.util.Scanner;
public class Number_divide_by_two_numbers {

    public static void divide(int a){

        if (a % 3 ==0 & a % 7 ==0 ){
            System.out.println("The given number is divisible by both 3 and 7");
        }
        else {
            System.out.println("The given number is not divisible by 3 and 7");
        }

    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number: ");

        number = sc.nextInt();

        divide(number);

    }
}
