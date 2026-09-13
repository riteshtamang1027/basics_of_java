package arrays;

import com.sun.security.jgss.GSSUtil;

public class SwapManMinPosition {
    public static void main(String[] args) {
        int []arr = {9,7,5,2,10,16,4};

        int min  = arr[0], max = arr[0], minInd = 0, maxInd=0;

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                minInd = i;
            }
        }
        System.out.println(min+" index at "+minInd);
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                maxInd = i;
            }
        }
        System.out.println(max+" index at "+maxInd);

        int temp = min;
        min = max;
        max = temp;

        System.out.println(min);
        System.out.println(max);


    }
}
