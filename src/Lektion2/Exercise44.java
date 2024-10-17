package Lektion2;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
/*
Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
detta antal tal och summera dem Skriv ut summan.
 */
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Skriv in antal number: ");
        int antalNumbers = scannerInput.nextInt();
        int sum = 0;

        for (int i =0; i<antalNumbers; i++) {
            int number = scannerInput.nextInt();
            System.out.print(sum + " + " + number);
            sum =sum+number;
        }
        System.out.println(sum);
    }
}
