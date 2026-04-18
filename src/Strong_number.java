import java.util.Scanner;

public class Strong_number {


   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 124
                ,reminder, fact_sum=0;

        while (number >0){
            reminder = number %10;
           int fact=1;
            for (int i=1;i<=reminder;i++){
                fact= fact *i;
            }
            fact_sum+=fact;
            number /=10;
        }
       System.out.println(fact_sum);


    }


}
