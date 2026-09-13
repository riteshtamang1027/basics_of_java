package arrays;

public class ArrayCalculation {
    public static int sum(int []arr){
        int sum = 0, length = arr.length;

        for (int i = 0; i < length; i++){
            sum += arr[i];
        }
        return sum;

    }

    public static int product(int []arr){
        int pro = 1, length = arr.length;

        for (int i = 0; i < length; i++){
            pro *= arr[i];
        }
        return pro;

    }

    public static void main(String[] args) {
        int []arr = {2,1,4,6};
        int sum = sum(arr);
        System.out.println("Sum: "+ sum);

        int product = product(arr);
        System.out.println("Product: "+product);


    }
}
