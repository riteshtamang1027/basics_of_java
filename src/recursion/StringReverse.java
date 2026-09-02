package recursion;

public class StringReverse {

    public static void reverseString(String text, int indx){

      if(indx == 0){
          System.out.println(text.charAt(indx));
          return;
      }

        System.out.println(text.charAt(indx));

      reverseString(text, indx-1);

    }

    public static void main(String[] args) {

        String sc = new String("Hello");
        reverseString(sc, sc.length()-1);
        System.out.println(sc);
//        String text  = "Hello";


//
//        for (int i=0; i<sc.length(); i++){
//            System.out.println(sc.charAt(i));
//        }

        String reverse = "";

        for(int i = sc.length()-1; i>=0;i--){
            reverse += sc.charAt(i);
        }
        System.out.println(reverse);


    }

}
