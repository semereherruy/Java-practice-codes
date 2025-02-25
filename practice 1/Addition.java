import java.util.Scanner;
public class Addition {
    public static void main(String args[]){
        int n1 = (int)(System.currentTimeMillis() % 10);
        int n2 = (int)(System.currentTimeMillis() / 7 % 10); // ?
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + n1 + " + " + n2 + " ?");
        int answer = input.nextInt();
        System.out.println(n1 + "+" + n2 + "= " + answer + " is " + (n1 + n2 == answer)); 

    }
}
