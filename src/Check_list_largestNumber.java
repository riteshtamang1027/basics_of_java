import java.util.Scanner;
public class Check_list_largestNumber {
    public  static  int check_largestNumber(int [] numbers){
        int largest = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (largest > numbers[i]){
                return largest;
            }
            else {
                largest = numbers[i];
            }
        }
        return largest;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i;
        System.out.print("Declare how many numbers you want to store: ");
        size = sc.nextInt();
        sc.nextLine();
        int [] list = new int[size];
        for (i = 0;i<size; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            list[i]=sc.nextInt();
        }
        System.out.println("The largest number is ");
        System.out.println(check_largestNumber(list));
    }
}
