import java.util.Scanner;
public class Hi{
    public static void main(String args[]){
        System.out.println("Hello !");
        double radius,area;
        final double PI = 3.14;
        System.out.print4("Enter radius: ");
        Scanner x = new Scanner(System.in);
        radius = x.nextDouble();
        area = radius * radius * PI; 
        System.out.println("Area of circle: " + area);
    }
}