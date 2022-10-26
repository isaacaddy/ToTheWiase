import java.util.Scanner;

public class three{
    public static void main(String[]args){
        int a,b,c,largest;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if (a>=b && a>=c)
        {
            System.out.println("The largest number is = "+a);
        }
        if (b>=a && b>=c)
        {
            System.out.println("The largest number is = "+b);
        }
        if (c>=b && c>=a)
        {
            System.out.println("The largest number is = "+c);
        }

    }
}