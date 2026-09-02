import java.util.Scanner;

public class Power_of_a_Number{

    public static int power(int base, int power){
        int result=1, original = power;


        if (power == 0){
            return result *= base;
        }

        else{
            while (power > 0){
                result *= base;
                power -=1;
            }
        }
        System.out.printf("The power of %d of %d is: ",base, original);

        return result;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base, power;
        System.out.print("Enter the base value or number: ");
        base = sc.nextInt();
        System.out.print("Enter base power value: ");
        power = sc.nextInt();
        sc.nextLine();

        if (base == 0 && power ==0){
            System.out.println("Invalid!");;
        }
        else {
            System.out.println(power(base, power));
        }

    }

}