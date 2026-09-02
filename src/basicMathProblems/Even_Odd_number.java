import java.util.Scanner;

public class Even_Odd_number {

    public static void sum_N_numbers(int number){
        int sum = 0, i;
        for (i = 1; i<=number; i++){
            sum +=i;
        }
        System.out.println("The sum of N number is: "+sum);

    }

//    Even number
    public static void even_number(int number){
        System.out.println("Here is a Even number ");
        for (int i = 0; i<=number; i++){
            if(i%2==0){
                System.out.printf("%d \n",i);
            }
        }

    }

//    sum of even number
    public static int sum_even_number(int number){
        int sum = 0, i;

        for (i = 1; i<=number; i++){
            if (i % 2==0){
                sum +=i;
            }
        }
        return sum;

    }

//    sum of odd number
    public static int sum_odd_number(int number){
        int sum=0,i;
        for (i = 1; i<=number; i++){
            if(i % 2 != 0){
                sum +=i;
            }
        }

        return sum;

    }
//    Odd number
    public static void odd_number(int number){
        System.out.println("Here is a Odd number ");
        for (int i = 0; i<=number; i++){
            if(i%2!=0){
                System.out.printf("%d\n",i);
            }
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("what is the range you want to print even or odd number, enter here: ");
        number = sc.nextInt();
        sc.nextLine();
        even_number(number);
        odd_number(number);

        sum_N_numbers(number);

        int sum = sum_even_number(number);
        System.out.println("The sum of even number is: "+sum);

        int sumO = sum_odd_number(number);
        System.out.println("The sum of odd number is: "+sumO);


    }
}
