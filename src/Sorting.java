
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    //    Bubble Sort function
    public static void bobbleSorting(int[] numbers ){

        for (int i = 0; i < numbers.length - 1; i++){

            for (int j = 0; j < numbers.length - 1 - i; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }

        }
        System.out.println("Bobble Sort: "+ Arrays.toString(numbers));

    }

    //    This is Selection sort
    public static void selectionSort(int[] numbers){

        for (int i = 0; i < numbers.length - 1; i++){
            int minimumIndex = i;

            for (int j = i + 1; j < numbers.length; j++){

                if(numbers[j] < numbers[minimumIndex]){
                    minimumIndex = j;
                }

            }

            int temp = numbers[minimumIndex];
            numbers[minimumIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Selection Sort: " + Arrays.toString(numbers) );

    }

    //    This is an Insertion sort.
    public static void insertionSort(int[] numbers){

        for (int i = 1; i < numbers.length; i++){

            int j = i - 1;

            while (i > 0 && numbers[j] > numbers[i]){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;

            }
        }

        System.out.println("Insertion Sort: "+ Arrays.toString(numbers));


    }

    public static void main(String[] args) {

//        This Scanner objects get the user input
        Scanner sc = new Scanner(System.in);

//        User declare the number of elements to store in a single array formate
        System.out.print("Declare the size of elements: ");
        int size = sc.nextInt();

//        Array object to store user input element
        int[] arrayElement = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("Enter %d index element: ", i);
            arrayElement[i] = sc.nextInt();
        }

//        Print array elements before sorting
        System.out.println("Before sorting elements: "+ Arrays.toString(arrayElement
        ));

        System.out.println("After sorting array elements using three sorting methods:");

//        call Bobble sort function
        bobbleSorting(arrayElement);

//        call Selection sort function
        selectionSort(arrayElement);

//        call Insertion sort function
        insertionSort(arrayElement);


    }
}