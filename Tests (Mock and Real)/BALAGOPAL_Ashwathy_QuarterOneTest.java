/*
 * commented what was not working well and replaced it with my suggestions
 * -mdv
 * 
 */


public class BALAGOPAL_Ashwathy_QuarterOneTest {

    public static void main(String[] args) {

        System.out.println("Ashwathy Balagopal");
        int number = IBIO.inputInt("Input a number please  =  ");
        int answer = number;
        int square = 0;
        int power = number;
        if (number >= 10 || number < 1) {
            System.out.println("Error in input");
            System.exit(0);
        }
        if (number < 10) {
            for (int i = 1; i <= number; i++) {
                //System.out.print (answer);
                System.out.print(i);
                //square = answer*answer;
                square = i * i;
                System.out.print("   " + square);
                power = 1;
                //for (int v=1; v<=answer; v++) {   //* The powers step does not work propery */
                for (int v = 1; v <= i; v++) {
                    power = power * answer;
                    //System.out.println("        " + power);
                }
                System.out.println("        " + power);
                //answer = answer - 1;
            }
        }

    }
}
