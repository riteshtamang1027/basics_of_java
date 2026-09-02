public class Print_Armstrong_Number {


    public static void print_armstrong_number(int number){

        int i, reminder;

        System.out.printf("Armstrong numbers from 1 to %d is \n",number);
        for(i = 1; i <= number; i++){
            int num = i;
            int digit = String.valueOf(i).length();
//

            int sum=0;

            while (num > 0) {
                reminder = num % 10;

                sum += (int) Math.pow(reminder, digit);

                num /= 10;
            }

            if (sum == i){
                System.out.println(i);
            }
//
        }
    }

   public static void main(String[] args) {

        print_armstrong_number(1000);


    }
}
