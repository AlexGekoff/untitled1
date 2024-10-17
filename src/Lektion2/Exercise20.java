package Lektion2;

public class Exercise20 {
    public static void main(String[] args) {
       // Skapa ett program som läser in ett tal. Om talet är mellan 0 och 9 ska kvadraten på talet
        // skrivas ut. Annars ska lämpligt felmeddelande ges.

        int number=12;

        if(number<=9) {
            System.out.println(number*number);

        }else {
            System.out.println("Talet är inte mellan 0-9");
        }

    }
}
