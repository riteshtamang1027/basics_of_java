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
        System.out.println("----- After sorting -----");
        System.out.println(Arrays.toString(numb));

    }

    static void main(String[] args) {

        int [] number = {42, 7, 19, 3, 56, 12, 89, 25, 1, 34};
        System.out.println("----- Before sorting -----");
        System.out.println(Arrays.toString(number));
        bubbleSort(number);


    }
}