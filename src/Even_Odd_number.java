import java.util.Scanner;

public class Even_Odd_number {

//    Even number
    public static void even_number(int number){
        System.out.println("Here is a Even number ");
        for (int i = 0; i<=number; i++){
            if(i%2==0){
                System.out.printf("%d \n",i);
            }
        }

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
    }
}
