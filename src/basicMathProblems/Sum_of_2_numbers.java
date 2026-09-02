import java.util.Scanner;

public class Sum_of_2_numbers {
    public static int sum (int a, int b){
        return a+b;
    }
    public static int difference (int a, int b){
        return a - b;
    }
    public static int product (int a, int b){
        return a * b;
    }
    public static int quotient (int a, int b){
        return a / b;
    }
    static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter first Integer number: ");
        number1= nu.nextInt();
        nu.nextLine();
        System.out.print("Enter Second Integer number: ");
        number2 = nu.nextInt();
        nu.nextLine();
       String result = String.format("------- Sum ------- \n%d + %d = %d", number1, number2,sum(number1,number2));
        System.out.println(result);
        String result1 = String.format("------- Difference ------- \n%d - %d = %d", number1, number2,difference(number1,number2));
        System.out.println(result1);
        String result2 = String.format("------- Product ------- \n%d * %d = %d", number1, number2,product(number1,number2));
        System.out.println(result2);
        String result3 = String.format("------- quotient ------- \n%d / %d = %d", number1, number2,quotient(number1,number2));
        System.out.println(result3);
    }
}
