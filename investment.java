//government investment plan...........
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
public class investment{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int preference;
        String user_name;
        int amount,age;
        int start_year, quit_year;
        int aprentice_fee = 2000;
        System.out.println("***************************** WELCOME *******************************");
        System.out.println("*                                                                   *");
        System.out.println("********** GOVERNMENT STUDENT AND TRADER INVESTMENT PLAN ************");
        System.out.println("*                     PLEASE SELECT YOUR PREFERENCE                 *");
        System.out.println("*                                                                   *");
        System.out.println("*********************************************************************");
        System.out.println("*    1. SCHOOL                     2. TRADER                        *");
        System.out.println("*                                                                   *");
        while(true){
            System.out.print(">> ");
             preference = input.nextInt();
              
             if(preference ==1 || preference==2){
                break;
             }
             else{
                System.out.println("Wrong input please try again");
             }
        }
        if(preference==1){
            
            System.out.println("   WELCOME TO THE STUDENT PORTAL  ");

            System.out.print("     PLEASE ENTER YOUR NAME: ");
            user_name = input.next();
           
            System.out.print("     PLEASE ENTER YOUR AGE: ");
            age = input.nextInt();

        /*comparing and limiting age */
            if (age<18 || age>30){
                 System.out.println("<<<<<<<< "+user_name+", you are  not qualified to enroll >>>>>>>>>");
            }

            else{
                System.out.println(" <<<<<<< You are qualified to enroll >>>>");
            
                System.out.print("     PLEASE ENTER START YEAR: ");
                start_year = input.nextInt(); 
                System.out.print("     PLEASE ENTER QUIT YEAR: ");
                quit_year = input.nextInt();
                /*calculating for start - quit year interval */
                amount = quit_year - start_year;
                //calculating investment for select user(invest plan=GHc100)
                System.out.println("Hey "+user_name +", your investment plan as a student for the given time is $"+(amount * 100)+".");
  
            }

        }
        //REQUESTING USER INPUT FOR ENROLLING AS TRADER
        else if(preference ==2){
            System.out.println("WELCOME TO THE TRADER'S PORTAL");
            System.out.print("     PLEASE ENTER YOUR NAME: ");
            user_name = input.next();
            System.out.print("     PLEASE ENTER YOUR AGE: ");
            age = input.nextInt();
            if (age<18 || age>30){
                System.out.println("<<<<<<<< "+user_name+", you are  not qualified to enroll >>>>>>>>>");
            }

            else{
                System.out.println(" <<<<<<< You are qualified to enroll >>>>");
        
                System.out.print("     PLEASE ENTER START YEAR: ");
                start_year = input.nextInt();
                System.out.print("     PLEASE ENTER QUIT YEAR: ");
                quit_year = input.nextInt();
                /*calculating for start - quit year interval */
                amount = (quit_year - start_year) + aprentice_fee;
                //calculating investment for select user(invest plan=GHc100)
                 System.out.println("Hey "+user_name+", your investment plan as a trader for the time given is $"+(amount * 70)+".");


    }

        }


    }
}