import java.util.Scanner;

public class Swap_number {
    public static void swapNumber(){
        int num1, num2, temp;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Second number: ");
        num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Before Swaping the numbers");
        System.out.println(num1);
        System.out.println(num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swaping the numbers");
        System.out.println(num1);
        System.out.println(num2);
    }
    static void main(String[] args) {
        swapNumber();
    }
}
