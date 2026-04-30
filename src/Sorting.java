public class Sorting {
    public static void main(String[] args) {

        int []array = {10,5,11,9,8,15};

        int length = array.length;

        System.out.println("Before sorting array elements: ");
        for (int i=0; i< length;i++){

            System.out.println(array[i]);

        }

        System.out.println("After sorting array elements:");

        for(int i=0; i<length-1; i++){
            for(int j=0; j< length-i-1; j++){
               if(array[j] > array[j+1]){
                   int temp = array[j];
                   array[j]= array[j+1];
                   array[j+1]= temp;
               }
            }
        }

        for (int i=0; i<length;i++){
            System.out.println(array[i]);
        }
    }
}