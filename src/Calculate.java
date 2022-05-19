import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        double kg, height, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your kg : ");
        kg = input.nextDouble();
        System.out.print("Please enter your height : ");
        height = input.nextInt();

        bodyMassIndex = (kg)/ height*height;

        System.out.println("Body Mass Index : " + bodyMassIndex);


    }
}
