public class LargestElementArray {

   public static void main(String[] args) {

       int []number = {1,2,3,4,5,7};



       for (int i=0; i < number.length; i++ ){
       System.out.println("The largest element is:");
       int largest = number[0];


      for(int i = 0; i < number.length; i++){



          if(number[i]>largest){

             largest = number[i];
          }



      }
       System.out.println(largest);




    }
}
