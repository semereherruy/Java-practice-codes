import java.util.Scanner;
public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter city 1: ");
        String city1 = input.nextLine();
        System.out.print("Enter city 2: ");
        String city2 = input.nextLine();
        if(city1.compareTo(city2) < 0)
        System.out.println("Alpahbetical order:" + city1 + " " + city2);
        else
        System.out.println("Not in order: " + city2 + " " + city1);
    }
}
