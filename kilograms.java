//Program that converts pounds to kilograms and vice versa..
import java.util.Scanner;

public class kilgrams {
public static void main(String args[]){
    Scanner gee = new Scanner(System.in);
    double kilo_value = 0.454;
    double weight_pounds;
    double weight_kilo;

    System.out.println(" <<<< Converting pounds to kilograms >>>>");
    System.out.println(" ****************************************");
    System.out.print(" Enter weight in pounds: \n >>> ");
    weight_pounds = gee.nextDouble();
    weight_kilo = weight_pounds * kilo_value;
    System.out.println(" Converted weight in kilograms: "+ weight_kilo);
    


}
    
}
