package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want to enter: ");
        int num = sc.nextInt();

        int []numList = new int[num];
        int start = 0, end = num - 1, temp;

//        Input the numbers from user
        for (int i = 0; i < num ; i++){
            System.out.printf("Enter %d index element: ",i);
            numList[i] = sc.nextInt();
        }

        System.out.println("Before reversing numbers");
        System.out.println(Arrays.toString(numList));

        while (start < end){
            temp = numList[start];
            numList[start] = numList[end];
            numList[end] = temp;
            start ++;
            end --;

        }

        System.out.println("After reversing numbers");
        System.out.println(Arrays.toString(numList));

    }
}
