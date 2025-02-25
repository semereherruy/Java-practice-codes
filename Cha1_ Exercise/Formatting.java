public class Formatting {
    public static void main(String args[]){
        System.out.printf("amount is %f %e\n",32.32,32.32);
        System.out.printf("amount is %5.4e\n",  32.32);
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");

        

    }
}
