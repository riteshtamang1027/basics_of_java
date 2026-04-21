import java.util.Scanner;

public class Number_check {
    public
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if ((num & (num - 1)) == 0){
            System.out.println(num + " is power of 2.");
        }
        else {
            System.out.println(num + " is not power of 2.");
        }

    }
}
