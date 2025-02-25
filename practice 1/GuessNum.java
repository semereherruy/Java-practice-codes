import java.util.Scanner;
public class GuessNum {
    public static void main(String args[]){
    throw java.io.IOException {    // ??  
        char ch,answer = 'k';
        Scanner input = new Scanner(System.in);
        System.out.println("Guess from A to Z");
        ch = (char)System.in.read();
        if(ch == answer)
        System.out.println("You got it,Bravo !!");
        else {
            System.out.print("...Sorry,you are");
            if(answer > ch)
            System.out.println("too high");
            else if(answer < ch)
            System.out.println("too low");
            }
    }    
    }
}
