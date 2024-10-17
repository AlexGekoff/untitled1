package Lektion2;

public class Exercise48 {
    public static void main(String[] args) {
/*
Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5
 */
        int fakultet = 3;
        int produkt =1;
        for(int i =1; i<=fakultet; i++){
            produkt=produkt *i;
            System.out.print(i + " * ");
        }
        System.out.println(" = " + produkt);

    }
}
