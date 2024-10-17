package Lektion2;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        /*En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
                övertidsbetalning för tiden utöver 40 tim med 1½ tim. Skapa ett program som läser in
        en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
        skrivas ut.

         */
        Scanner input = new Scanner(System.in);

        System.out.print("Ange din timlön: ");
        double timlon = input.nextFloat();

        System.out.print("Ange antalet arbetade timmar under veckan: ");
        double arbetstimmar = input.nextFloat();

        double normaltid = 40;
        double overtid = arbetstimmar-normaltid;
        double veckolonNormal = timlon*arbetstimmar;
        double veckoLonOver = (veckolonNormal) + (overtid * timlon * 1.5);

        if(arbetstimmar>normaltid) {
            System.out.println("Din total veckolön är: " + " " +veckoLonOver);
        } else {
            System.out.println("Din total veckolön är: " + " " +veckolonNormal);
        }







    }
}
