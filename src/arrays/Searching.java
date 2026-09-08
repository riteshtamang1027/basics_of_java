package arrays;

import java.util.Scanner;

public class Searching {

    public static void linearSearch(int []numbers, int searchValue){
int index = -1;
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] == searchValue){
               index = i;
               break;

            }
        }

        if(numbers[index] == searchValue){
            System.out.printf("The searching number %d is at index %d",searchValue, index);
        }

       else {
            System.out.printf("The searching number isn't found %d: ", index);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to search: ");
        int searchValue = sc.nextInt();

        int []numbList = {47, 12, 89, 34, 76, 5, 63, 21, 95, 38, 54, 8, 71, 26, 43, 99, 17, 60, 31, 84};

        linearSearch(numbList, searchValue);

    }
}
