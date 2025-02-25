import java.util.Scanner;
public class Average{
    public static void main(String args[]){
        double n1,n2,n3,average;
        System.out.println("Enter 3 numbers:");
        Scanner input = new Scanner(System.in);
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        average = (n1 + n2 + n3)/3;
        System.out.println("Average: " + average);
    }
}