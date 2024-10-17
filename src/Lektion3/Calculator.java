package Lektion3;

// Skapa en class Calculator som läser in två tal i konstruktorn och sparar dem som attribut
public class Calculator {

    private int num1;
    private int num2;

    // Konstruktor som läser in två tal
    public Calculator(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    // Metod för addition
    public int addition() {
        System.out.println("Resultatet av addition: " + (num1 + num2));
        return num1+num2;
    }
}