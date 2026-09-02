import java.util.Scanner;

public class Swap_number {

    public static void swapNumber_withVariable(int num1, int num2){
        int temp;
        System.out.println("----- Using extra variable -----");
        System.out.println("Before Swaping the value");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swaping the value");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }


    public static void swapNumber_withoutVariable(int a, int b){
        System.out.println("----- Without using extra variable -----");
        System.out.println("Before swaping the values");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("After swaping the values");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter first Number: ");
        number1= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second Number: ");
        number2= sc.nextInt();
        sc.nextLine();
//        using extra variable call function
        swapNumber_withVariable(number1, number2);

//        without using extra variable call function
        swapNumber_withoutVariable(number1, number2);

    }
}
