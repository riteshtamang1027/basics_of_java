package bitManipulation;

public class CheckThePowerOf2 {
    public static void main(String[] args){
        int number = 16;

        if(number > 0 && ((number & number -1) == 0)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
