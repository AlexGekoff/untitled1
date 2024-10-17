package Lektion2;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
       /* Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall ska ett
        lämpligt meddelande ges.

        */
                Scanner input = new Scanner(System.in);


        System.out.print("Läser in ett tal: ");
        int tal = input.nextInt();

        if (tal<=-10) {
            System.out.println("Talet är mindre -10 ");
        } else if (tal>=10) {
            System.out.println("Talet är större än 10 ");
        } else {
            System.out.println("Talet är mellan -10 och 10.");
        }



    }
}
