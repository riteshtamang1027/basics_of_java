import java.util.Scanner;

public class Square_of_number {
    public static int square(int a) {
        return a*a;
    }
    public  static int cube(int a){
        return a*a*a;
    }
    public static void switchCase(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.println("----- Choose One -----");
        String[] list={"1. Square","2. Cube"};
        for(int i=0; i< list.length;i++){
            System.out.println(list[i]);
        }
        int choice;
        System.out.print("choose any one: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                String result = String.format("The square of %d is %d",number,square(number));
                System.out.println(result);
                break;
            case 2:
                String result1 = String.format("The square of %d is %d",number,cube(number));
                System.out.println(result1);
                break;
            default:
                System.out.println("Invalid number.");
        }

    }
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        switchCase();
    }
}
