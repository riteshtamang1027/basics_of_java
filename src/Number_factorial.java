public class Number_factorial {
    static void main(String[] args) {
     int i,j;
     for (i=1;i<=10;i++){
         int factorial = 1;
         for (j=1; j<=i; j++){
             factorial *=j;
         }
         System.out.println(i +"!="+factorial);
     }

    }
}
