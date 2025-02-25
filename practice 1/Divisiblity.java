import java.util.Scanner;
public class Divisiblity {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num % 2 == 0 && num % 3 == 0 )
        System.out.println("Divisible by 2 & 3");
        if(num % 2 == 0 || num % 3 == 0)
        System.out.println("Divisible either by 2 or 3");
        if(num % 2 == 0 ^ num % 3 == 0)
        System.out.println("Divisuble by 2 and 3,but not by both");
    }
}
