import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int check = input.nextInt();
        if(check % 2 == 0)
        System.out.println("Even");
        else if(check % 2 != 0)
        System.out.println("Odd");
    }
}
