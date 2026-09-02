import java.util.Scanner;

public class Armstrong_number {

    static void main(String[] args) {
        int number, sum =0, reminder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any more than two digit number: ");

        number = sc.nextInt();

        int num = number;
        int digits = String.valueOf(num).length();

        while (number >0){
            reminder = number%10;
            sum = sum + (int)Math.pow(reminder, digits);
            number /=10;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.printf("The input number %d is a armstrong number",num);
        }
        else {
            System.out.printf("The input number %d is not a armstrong number",num);

        }
    }
}
