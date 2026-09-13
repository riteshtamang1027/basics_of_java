package arrays;

import java.util.Arrays;

public class ChangeReference {

    static void changeReference(int []arr) {

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i] *=2);
        }
    }
    static void main(String[] args) {
        int []arr = {1,2,3};
        changeReference(arr);
        System.out.println(Arrays.toString(arr));
    }
}
