package Lektion3;

import java.util.Scanner;

public class BankAccountTransactions {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till din bank, vad vill du göra: ");
        System.out.println("1 Bestämma mitt saldo");
        System.out.println("2 Se saldo");
        System.out.println("3 Uttag");
        System.out.println("4 Insättning");
        System.out.println("5 Avsluta");

        BankAccount myAccount = new BankAccount();
        int val;

        do {
            val = scanner.nextInt();
            if (val == 1) {
                System.out.println("Vilket saldo har du på kontot");
                int saldo = scanner.nextInt();
                myAccount.setSaldo(saldo);
            }
            if (val == 2) {
                System.out.println("Ditt saldo är " + myAccount.getSaldo());
            }
            if (val == 3) {
                System.out.println("Hur mycket vill du ta ut");
                int belopp = scanner.nextInt();
                if(myAccount.withdrawOK(belopp)) myAccount.withdrawOK(belopp);
                else System.out.println("Tyvärr du kan inte ha mindre är 0 på kontot");
                myAccount.withdraw(belopp);
            }
            if (val == 4) {
                System.out.println("Hur mycket vill du sätta in");
                int belopp = scanner.nextInt();
                myAccount.deposit(belopp);
            }
        } while (val != 5);

    }
}
