package Lektion2;

public class Exercise16 {
    public static void main(String[] args) {

        /*En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle handlar för
        minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett visst slag. Skapa ett
        program som beräknar vad en kund ska betala. Indata till algoritmen ska vara antalet
        köpta enheter och priset per enhet.

         */
        int productsNumber = 5;
        int price = 100;
        float rabattProcent = 10.0f;
        float rabatt = rabattProcent / 100;

        int betalaUtanRabbat = productsNumber * price;
        float betatalaMedRabbat = betalaUtanRabbat * (1 - rabatt);

        if (betalaUtanRabbat <= 1000) {
            System.out.println("Du ska betala " + betalaUtanRabbat);

        } else {
            System.out.println("Du ska betala " + betatalaMedRabbat);
        }
    }

    }

