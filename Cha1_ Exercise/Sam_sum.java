import java.util.*;
public class Sam_sum{
    public static void main(String []args){
      System.out.println("enter a number i will tell you the summation of its divisors"); 
    Scanner input= new Scanner(System.in);
    String a=input.nextLine();
    sumDigits(a);
    
    }
    public static int sumDigits(String n){
      int sum=0;
      for(int i=0;i<n.length();i++){
int b=Integer.parseInt(n.charAt(i));
sum+=b;
      }
    }
}