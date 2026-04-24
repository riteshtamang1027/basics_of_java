import java.util.Scanner;

public class Array_Sum {

    public static void sum(int []array){
        //      System.out.println("Array Elements");
        int i, sum =0 ;

        for (i=0; i<array.length;i++){
            sum += array[i];
        }
        System.out.println("The sum of an array element is: "+sum);

    }


//    average
    public static void average(int []array){
        int avg=0, i;
        for ( i = 0; i<array.length;i++) {
            avg = (avg + array[i]);
        }
        avg = avg/array.length;
        System.out.println("Average = "+ avg);
    }


  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int []array = new int[4];

      int i ;
       for ( i = 0; i< array.length; i++){
           System.out.printf("Enter %d element: ",i+1);
           array[i]= sc.nextInt();
       }

      for ( i = 0; i< array.length; i++){
          System.out.printf("Enter %d index element is: %d \n",i,array[i]);

      }

       sum(array );
       average(array);

    }
}
