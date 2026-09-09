package arrays;

import java.util.Arrays;

public class SortingAlgorithm {
//    Using bubble sort algorithm
    public static void bubbleSort(int []numb){
        int len = numb.length;

        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - 1 - i; j++){
               if (numb[j] > numb[j + 1]){
                   int temp = numb[j];
                   numb[j] = numb[j + 1];
                   numb[j + 1] = temp;
               }

            }
        }
        System.out.println("----- Sorted numbers using bubble sort algorithm -----");
        System.out.println(Arrays.toString(numb));

    }

//    Using selection sort

    public static void selectionSort(int []numb){

        int leng = numb.length;

        for (int i = 0; i < leng - 1; i ++){
            int min = i;
            for (int j = i; j < leng; j++){
                if (numb[j] < numb[min]){
                    min = j;
                }
            }

            int temp = numb[i];
            numb[i] = numb[min];
            numb[min] = temp;
        }
        System.out.println("----- Sorted numbers using selection sort algorithm -----");
        System.out.println(Arrays.toString(numb));

    }

    static void main(String[] args) {

        int [] number = {42, 7, 19, 3, 56, 12, 89, 25, 1, 34};
        System.out.println("----- Before sorting -----");
        System.out.println(Arrays.toString(number));
        bubbleSort(number);
        selectionSort(number);


    }
}