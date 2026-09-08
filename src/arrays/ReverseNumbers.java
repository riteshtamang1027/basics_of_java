package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {

    public static void reverseArray(int []numbers, int num){
        int start = 0, end = num - 1, temp;

        System.out.println("Before reversing numbers");
        System.out.println(Arrays.toString(numbers));

        while (start < end){
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;

        }

        System.out.println("After reversing numbers");
        System.out.println(Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Declare the number, how much user wat
        System.out.print("How many number do you want to enter: ");
        int num = sc.nextInt();

//        assign the variable to store numbers
        int []numList = new int[num];


//        Input the numbers from user
        for (int i = 0; i < num ; i++){
            System.out.printf("Enter %d index element: ",i);
            numList[i] = sc.nextInt();
        }

        reverseArray(numList, num);

    }
}
