public class SumNatural_number {

    public static void sumPrint(int n, int i, int sum){

        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }

        sum += i;

        sumPrint(n, i+1, sum);

    }

   public static void main(String[] args) {
        int number = 20;
       System.out.printf("The sum of %d natural number is: ",number);

        sumPrint(number, 1,0);

    }

}
