import java.util.Scanner;
public class Perfect_number {
    public static void check_perfectNumber(int num){
        int sum=0, i;
        for (i = 1; i<=(num/2); i++){
            if(num % 2 == 0){
                sum +=i;
            }
        }

        if(sum == num && num !=0 ){
            System.out.printf("%d is a perfect number \n",num);
        }
        else {
            System.out.printf("%d is not a perfect number \n",num);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter any integer number: ");

        number = sc.nextInt();
        sc.nextLine();

        check_perfectNumber(number);

    }

}
