public class Reverse_Number {

    public static void reverse_numbers(int number){
        int i;
        for ( i= 1; i<= number; i++){
            int num = i, reminder, reverse = 0;
            while (num > 0){
                reminder = num % 10;

                reverse = reverse * 10 + reminder;

                num /= 10;

            }
            System.out.printf("%d = %d \n", i, reverse);

        }
    }

  public  static void main(String[] args) {
        reverse_numbers(100);

    }
}
