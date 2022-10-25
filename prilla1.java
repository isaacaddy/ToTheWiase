import java.util.Scanner;

// program to calculate energy bill for consumer
public class prilla1 {
    public static void main(String[]args) {
        int unit_rate = 2;
        float watts, consumer_bill;
        int month, new_month;
        Scanner input = new Scanner(System.in);

        // requesting consumer power(kw/h) and month used
        // month must be converted to hours
        System.out.print("ENTER POWER CONSUMED: ");
        watts = input.nextFloat();
        System.out.println(">>> "+ watts+"kw/h");
        System.out.print("ENTER NUMBER OF MONTHS(hour convert) TO CALCULATE: ");
        month = input.nextInt();
        new_month = (month * 30)*24; 
        System.out.println(">>> "+ new_month+" hours");

        //CALCULATIN CONSUMER BILL
        consumer_bill = watts*unit_rate;
        System.out.println(">>> YOUR BILL FOR "+month+" MONTH IS: GHC "+ consumer_bill);



    }
}
