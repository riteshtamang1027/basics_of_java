import java.util.Scanner;

public class Factors {

//    possible factors
    public static void factors(int number){
        int i;
        System.out.printf("The factors of the Number %d is \n",number);
        for (i = 1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

//    count the factors
    public static void count_factor(int number){
        int count = 0,i;
        for(i=1;i<=number;i++){
            if (number %i ==0)
                count +=1;
        }
        System.out.printf("The number of possible factors of %d is %d \n",number,count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int number;
        System.out.print("Enter an integer number: ");
        number = sc.nextInt();

        factors(number);
        count_factor(number);

    }
}
