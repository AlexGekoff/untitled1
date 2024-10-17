package Lektion2;

public class Exercise17 {
    public static void main(String[] args) {
        //Skapa ett program som läser in två tal och dividerar det första talet med det andra talet. Om
        //det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten skrivas ut.

        float number1=10;
        float number2=0;
        float resultat = number1/number2;

        if(number2==0) {
            System.out.println("Felmeddelande");
        } else {
            System.out.println(resultat);
        }
    }
}
