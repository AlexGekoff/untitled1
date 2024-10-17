package Lektion1;

public class Exercise7 {
    public static void main(String[] args) {
        /*Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala

         */

        float antalliter=10.0f;
        float prisPerLitr = 1.25f;
        float rabattProcent = 10.0f;
        float totalPris = antalliter * prisPerLitr;
        float rabatt =rabattProcent/100;


        float resultatBetala = totalPris*(1-rabatt);
        System.out.println("Du ska betala " + resultatBetala);

    }
}
