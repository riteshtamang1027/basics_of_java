import java.util.Scanner;

public class Factors {

    public static void factors(int number){
        int i;
        System.out.printf("The factors of the Number %d is \n",number);
        for (i = 1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int number;
        System.out.print("Enter an integer number: ");
        number = sc.nextInt();

        factors(number);

    }
}
