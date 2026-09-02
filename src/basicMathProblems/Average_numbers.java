import java.util.Scanner;

public class Average_numbers {

    public static  void average(int []numbers, int size){
        int total = 0,i;
        double avg;
        System.out.println("The given number is ");
        for (i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        for (i=0;i<numbers.length;i++){
            total = (total+numbers[i]);
        }
        avg = total/size;
        System.out.println("The average of given number is = "+avg);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Declare the size of array: ");
        number = sc.nextInt();
        sc.nextLine();
        int [] numbers = new int[number];

        for(int i=0;i<number;i++){
            System.out.print("Enter the "+(i+1)+" number: ");
           numbers[i]=sc.nextInt();
            sc.nextLine();
        }
        average(numbers,number);

    }
}
