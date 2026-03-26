import java.util.Scanner;
public class Check_prime {

public static void check_prime(){
    int number, count = 0,i;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any integer number: ");
    number = sc.nextInt();

    if (number == 0 || number==1){
        System.out.println("The number "+number+" is not a prime.");
    }

        for (i = 2; i <= number/2; i++){
          if (number % i ==0){
             count ++;
          }

        }
        if (count ==0){
            System.out.println("The number "+number+" is a prime.");
        }
 else {
            System.out.println("The number "+number+" is not a prime.");
        }


}
public static void main(String[] args){
    check_prime();
}

}
