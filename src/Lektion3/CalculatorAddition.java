package Lektion3;

import java.util.Scanner;

public class CalculatorAddition {
    public static void main(String[] args) {

        // Skapar en Scanner för att läsa in användarens tal
        Scanner scanner=new Scanner(System.in);

        // Läser in två tal från användaren
        System.out.print("Ange första talet: ");
        int number1 = scanner.nextInt();

        System.out.print("Ange andra talet: ");
        int number2 = scanner.nextInt();

        // Skapar ett Calculator-objekt med de inlästa talen
        Calculator calc = new Calculator(number1, number2);

        // Anropar metoderna för de olika operationerna
        calc.addition();

    }
}
