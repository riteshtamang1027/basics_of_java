public class Multiplication_tables {

    public static void tables(int number){
       int i,j;
       for ( i = 1; i <= number; i++){
           int multiple=1;
           for ( j= 1; j <= 10; j++){

               multiple = i * j;

               System.out.printf("%d * %d = %d \n",i,j,multiple);

           }
           System.out.println(" ");

       }
    }

    public static void main(String[] args) {

        tables(5);
    }
}
