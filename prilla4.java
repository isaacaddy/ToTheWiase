//program to calculate discount annd ptints "BYE!!" to the user....
import java.util.Scanner;

public class prilla4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double product_price;
        double dis_price;
        double [] discount = {0.12, 0.20, 0.30, 0.50};

        //prompt user to input the product price for discount.....
        System.out.println(" ~~ Please enter product price: ");
        System.out.print(">>> GHC ");
        product_price = sc. nextDouble();

        if (product_price < 50){
            dis_price = product_price - discount[0];
            System.out.println(" Discout off-price for product is: GHC"+ dis_price);
            System.out.println(" THANK YOU FOR PURCHASING FROM US.. BYE!!....");
        }
        else if (product_price > 50 || product_price < 149){
            dis_price = product_price - discount[1];
            System.out.println(" Discout off-price for product is: GHC "+ dis_price);
            System.out.println(" THANK YOU FOR PURCHASING FROM US.. BYE!!....");

        }
        else if (product_price > 150 || product_price < 200){
            dis_price = product_price - discount[2];
            System.out.println(" Discout off-price for product is: GHC "+ dis_price);
            System.out.println(" THANK YOU FOR PURCHASING FROM US.. BYE!!....");

        }
        else {
            dis_price = product_price - discount[3];
            System.out.println(" Discout off-price for product is: GHC "+ dis_price);
            System.out.println(" THANK YOU FOR PURCHASING FROM US.. BYE!!....");

        }

    }
}
