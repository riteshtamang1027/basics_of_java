import java.util.Scanner;

//square function
public class Square_number {
    public static void square(int number){
        int i;
        System.out.println("Square of a number");
        for(i=1;i <= number;i++){
            System.out.printf("The square of %d is: %d\n",i,i*i);
        }
    }

//    cubes function
    public static void cubes(int number){
        System.out.println("Cube of a number");
        int i;
        for(i=1;i<=number;i++){
           int cube = (int) Math.pow(i,3);
            System.out.printf("The cube of %d is: %d\n",i,cube);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter an integer number: ");
        number = sc.nextInt();

        square(number);

        cubes(number);

    }
}
