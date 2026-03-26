import java.util.Scanner;

public class Table {

   public static void main(String[] args) {

       int number, mult=1, i = 0;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter any number: ");

       number = sc.nextInt();

       while (i <=10){
           mult = i * number;

           System.out.println(number+" * "+i +" = "+mult);

           i++;

       }

    }
}
