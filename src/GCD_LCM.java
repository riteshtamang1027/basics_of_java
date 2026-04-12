import java.util.Scanner;

public class GCD_LCM {

//    Gratest common divisor
    public static void gcd(int n1, int n2){

        int reminder;

        while(n2 != 0){
            reminder = n1%n2;
            n1 = n2;
            n2 = reminder;
        }
        System.out.printf("The gratest common divisor number is %d \n",n1);
    }

//   Least Common Multiple
    public static void lcm(int num1, int num2){
        int reminder, result = 1, n1 = num1, n2 = num2;
        while (num2 !=0){
            reminder = num1 %num2;
            num1 = num2;
            num2= reminder;
        }
        result = (n1*n2)/num1;
        System.out.printf("The least common multiple number is %d \n",result);

    }
    static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        number1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second integer number: ");
        number2 = sc.nextInt();
        gcd(number1, number2);
        lcm(number1, number2);
    }
}
