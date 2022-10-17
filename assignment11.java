import java.util.Scanner;

public class assignment11 {

    public static void main(String[]args){
        /*intializing general year of investment plan at year 2000 */
        int mine = 2000;
        System.out.println("***************************** WELCOME *******************************");
        System.out.println("*                                                                   *");
        System.out.println("********** GOVERNMENT STUDENT AND TRADER INVESTMENT PLAN ************");
        System.out.println("*                     PLEASE SELECT YOUR PREFERENCE                 *");
        System.out.println("*                                                                   *");
        System.out.println("*********************************************************************");
        System.out.println("*    1. SCHOOL                     2. TRADER                        *");
        System.out.println("*                                                                   *");


        /*REQUESTING USER UNPUT FOR ENROLLING AS STUDENT */

        String user_name;
        int xx,age;
        int start_year, quit_year;
        Scanner input = new Scanner(System.in);
        System.out.print("     PLEASE ENTER YOUR NAME: ");
        user_name = input.nextLine();
        System.out.print("     PLEASE ENTER YOUR AGE: ");
        age = input.nextInt();

        /*comparing and limiting age */
        if (age<18 || age>30){
            System.out.println("<<<<<<<< You are  not qualified to enroll >>>>>>>>>");
        }

        else{
            System.out.println(" <<<<<<< You are qualified to enroll >>>>");
            
            System.out.print("     PLEASE ENTER START YEAR: ");
        start_year = input.nextInt();
        System.out.print("     PLEASE ENTER QUIT YEAR: ");
        quit_year = input.nextInt();
        /*calculating for start - quit year interval */
        xx = quit_year - start_year;
        //calculating investment for select user(invest plan=GHc100)
        System.out.println("Your investment plan as a student for "+ xx +" years is "+(xx * 100));
  
        }


       /*REQUESTING USER UNPUT FOR ENROLLING AS TRADER */
       System.out.print("     PLEASE ENTER YOUR NAME: ");
        user_name = input.nextLine();
        System.out.print("     PLEASE ENTER YOUR AGE: ");
        age = input.nextInt();
       if (age<18 || age>30){
        System.out.println("<<<<<<<< You are  not qualified to enroll >>>>>>>>>");
    }

    else{
        System.out.println(" <<<<<<< You are qualified to enroll >>>>");
        
        System.out.print("     PLEASE ENTER START YEAR: ");
    start_year = input.nextInt();
    System.out.print("     PLEASE ENTER QUIT YEAR: ");
    quit_year = input.nextInt();
    /*calculating for start - quit year interval */
    xx = quit_year - start_year;
    //calculating investment for select user(invest plan=GHc100)
    System.out.println("Your investment plan as a trader for "+ xx +" years is "+(xx * 70));


    


    }
    }
}

