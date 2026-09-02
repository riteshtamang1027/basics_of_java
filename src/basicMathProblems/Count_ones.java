public class Count_ones {
    public static void main(String[] args) {

        int number = 16, org=number, count =0;

        while (number > 0){

            number &= number - 1;

            count ++;

        }
        System.out.printf("Number of 1's in %d is %d",org, count);

    }
}
