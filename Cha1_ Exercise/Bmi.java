import java.util.Scanner;
public class Bmi {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();
        final double KILOGRAM_PER_POUNDS = 0.454;
        final double METER_PER_INCH = 0.0254;
        double weight_in_kilo = KILOGRAM_PER_POUNDS * weight;
        double height_in_Meter = METER_PER_INCH * height;

        double bmi = weight_in_kilo/(height_in_Meter * height_in_Meter);
        if (bmi < 18.5)
        System.out.println("Underweight");
        else if(bmi >= 18.5 && bmi < 25.0)
        System.out.println("Normal");
        else if(bmi >= 25.0 && bmi < 30)
        System.out.println("Overweight");
        else if(bmi > 30)
        System.out.println("Obese");
    }
}
