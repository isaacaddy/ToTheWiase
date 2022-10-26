/*The tuition fee for GCTU is GH$ 2400 per year. Suppose the university financial
committee recommends that tuition should be increased at an annual rate of 5%.
Write a program that uses a loop to compute the tuition in ten years.*/
public class tution {
    public static void main(String args[]){
        

        double fee = 2400;

        for ( int n=1; n<=10; n++){

            fee =  fee + (fee  * 0.05);
            System.out.println("Year "+ n +": GHc " + fee);

        }
        //year 1: GHc 2500;
        //year 2: GHc 3500;





      class Main {
    public static void main(String[] args) {

        double fee = 2400;
        int n =1; //incremental

        while (n<=10){
            fee = fee + (fee * 0.05);
            System.out.println("Year " + n + ": $ " + fee);
            n++;

        }

    }
}
class Maine {
    public static void main(String[] args) {

        double fee = 2400;
        int n =1; //incremental

        do {
            fee = fee + (fee + 0.05);
            System.out.println("Year " + n + ": $ " + fee);
            n++;
        }while(n<10);



    }
}









    }
}
