package recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String source, String helper, String destination){

        if(n == 1){
            System.out.printf("Transfer disk %d from %s to %s\n", n, source, destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.printf("Transfer disk %d from %s to %s\n", n, source, destination);

        towerOfHanoi(n-1, helper, source, destination);

    }

   public static void main(String[] args) {

        towerOfHanoi(4, "s","h","d");

    }

}
