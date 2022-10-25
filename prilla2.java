//program for fractorial... 
import java.util.Scanner;

public class prilla2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i,fact=1;
        int num;
        System.out.print(">>> ENTER NUMBER FOR FACTORIAL: ");
        num = input.nextInt();

        for (i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println("FACTORIAL OF "+num+" is: "+ fact);


    }
}
