import java.util.Scanner;

//program that calculates the area and volume of a cylinder...
public class prilla3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //declaring (area) varibles..
        int preference;
        double area,radius; 
        double pi = 3.142;
        int i = 1;
        //declaring (volume) variables...
        double volume,Area;
        double llenght;
        System.out.println("*   >>>>>>PLEASE SELECT WHAT YOU CALCULATE FOR.. <<<<<< *");
        System.out.println("*       1. AREA                      2. VOLUME          *");

        while(true ){
            System.out.print(">>> ");
            preference = input.nextInt();

            if (preference ==1 || preference ==2){
                break;
            }
            else{
                System.out.println("WRONG INPUT");
            }
        }
        if (preference ==1){
        //calculating area
        System.out.println("*     >>> ENTER RADIUS:                                 *");
        System.out.print(">>> ");
        radius = input.nextDouble();
        System.out.println("*     >>> ENTERED VALUE FOR RADIUS is: "+radius+"             *");
        //eqution for area...
        area = radius * radius * pi;
        System.out.println("*     >>> CALCULATED AREA FOR "+ radius+" IS "+area+"           *");
        }

        else if (preference ==2){
        //calculating volume....
        System.out.print(">>> ENTER AREA: ");
        Area = input.nextDouble();
        System.out.println(">>> ENTERED VALUE FOR RADIUS IS: "+Area+"               *");
        System.out.print(">>> ENTER LENGHT: ");
        llenght = input.nextDouble();
        System.out.println(">>> ENTERED VALUE FOR LENGHT IS: "+llenght+"            *");
        //equation for volume....
        volume = Area*llenght;
        System.out.println(">>> CALULATED VOLUME IS "+volume+"                        *");
        }


    }
}
