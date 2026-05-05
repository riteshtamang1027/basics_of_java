import java.util.Scanner;

public class CheckArrayElement {

//    find largest number function
    public static void largestNumber(int []numbers,int n)
    {
        int i;
        int largest = numbers[0];

        for(i=1; i<n; i++){

            if(numbers[i] > largest){
                largest = numbers [i];
            }
        }

        System.out.printf("\n%d is the largest number among the given numbers.",largest);

    }

//    find smallest number function
    public static void smallestNumber(int []numbers, int n){

        int i;
        int smallest = numbers[0];

        for (i=1;i<n;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.printf("\n%d is the smallest number among the given numbers.",smallest);


    }

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Initialize the numbers of elements: ");
       int n = sc.nextInt();
       int [] numbers = new int[n];
       int i;

       for (i=0; i< n; i++){
           System.out.printf("Enter %d element: ",i+1);
           numbers[i] = sc.nextInt();
       }

       System.out.println("The array element is");
       for (i=0; i<n;i++ ){
           System.out.printf("%d,",numbers[i]);
       }


//       largest number function call
       largestNumber(numbers,n);

//       small number function call
       smallestNumber(numbers,n);

    }
}