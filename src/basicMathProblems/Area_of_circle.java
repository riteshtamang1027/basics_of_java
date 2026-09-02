import java.util.Scanner;

public class Area_of_circle {
    public static double area_circle(){
        double radius, area;
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        radius = sc.nextDouble();
        sc.nextLine();
        area = pi * (radius * radius);
        return  area;

    }

    static void main(String[] args) {
        System.out.println("The area of circle is: ");
        System.out.print(area_circle());
    }
}
