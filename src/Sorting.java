public class Sorting {


//    bubble sort
    public static void bubbleSort(int array[]){
        int length = array.length,i;

        System.out.println("\nBobble sorting array elements:");

        for( i=0; i<length-1; i++){
            for(int j=0; j< length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }


        for ( i=0; i<length;i++){
            System.out.printf("%d,",array[i]);
        }
    }

//    Insertion sort
    public static void insertionSort(int array[]){
        int i,j, length= array.length;

        System.out.println("\n Insertion sorting");

        for( i = 1; i < length; i++){
            int current = array[i];
            j = i-1;
            while (j >=0 && current < array[j]){
                array[j+1] = array[j];

                j--;
            }
            array[j+1] = current;

        }

        for(i = 0; i<length; i++){
            System.out.printf("%d,",array[i]);
        }

    }


//    Selection sort

    public static void selectionSort(int arr[]){

        int i,j, length=arr.length;

        System.out.println("\nSelective sorting array element");

        for(i=0; i< length; i++){
            int smallest = i;

            for (j=i+1; j < length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;

                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
for (i=0; i<length;i++) {
    System.out.printf("%d,", arr[i]);
}
    }


    public static void main(String[] args) {

        int []array = {10,5,11,9,8,15};

        int length = array.length;

        System.out.println("Before sorting array elements: ");
        for (int i=0; i< length;i++){

            System.out.printf("%d,",array[i]);

        }


        bubbleSort(array);

        selectionSort(array);

        insertionSort(array);

    }
}