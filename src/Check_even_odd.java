import java.util.Scanner;
public class Check_even_odd {
    public static  void number_check(){
//        while (true)
//        {
            Scanner sc = new Scanner(System.in);

            int number;
            System.out.print("Enter any integer number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("The given number is even.");
            } else {
                System.out.println("The given number is an odd.");
            }
//        }
    }
    static void main(String[] args) {
        number_check();

    }
}
