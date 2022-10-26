import java.util.Scanner;

//product of three numbers
public class quest1{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int ap,bp,cp;
        int product;
        System.out.print(" ENTER FIRST NUMBER: \n >>> ");
        ap = sc.nextInt();
        System.out.print(" ENTER SECOND NUMBER: \n >>> ");
        bp = sc.nextInt();
        System.out.print(" ENTER THIRD NUMBER: \n >>> ");
        cp = sc.nextInt();

        //product of three numbers...
        product = ap*bp*cp;
        System.out.println(" PRODUCT OF THREE NUMBERS: " + product);


    }
}