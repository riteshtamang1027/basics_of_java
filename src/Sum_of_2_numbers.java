import java.util.Scanner;

public class Sum_of_2_numbers {
    public static int sum (int a, int b){
        return a+b;

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
        System.out.println("------- Sum -------");
       String result = String.format("%d + %d = %d", number1, number2,sum(number1,number2));
        System.out.println(result);
    }
}
