import java.util.Scanner;

public class Strong_number {

//    function which check the number is a strong or not.
    public static void check_strong(int number){
        int i, reminder, sum =  0, original = number;
        while(number > 0){
            reminder = number % 10;

            int factorial = 1;
            for(i = 1; i <= reminder; i++){
                factorial = factorial * i;
            }

            sum += factorial;

            number /= 10;
        }

        System.out.println("The total sum of enter number factorial is: "+sum);
// if the sum of the input number factorial is equal to the enter number then it show the enter number is a strong number
        if (original == sum){
            System.out.println("The input number is strong number.");
        }
        else {
            System.out.println("The input number isn't strong number.");
        }

    }


   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
       System.out.print("Enter number: ");

       number = sc.nextInt();

//       function call
       check_strong(number);




    }


}
