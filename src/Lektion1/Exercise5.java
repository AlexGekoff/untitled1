package Lektion1;

public class Exercise5 {
    public static void main(String[] args) {

        int sek = 10;
        float exchangeUSD = 6f;
        float exchangeGBP = 10f;

        float resultUSD = sek/exchangeUSD;
        float resultGBP = sek/exchangeGBP;

        System.out.println("You have" + " " + sek + " " + "SEK");
        System.out.printf("This is %.2f USD\n", resultUSD);
        System.out.printf("This is %.2f GBP\n", resultGBP);
    }
}
