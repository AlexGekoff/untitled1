package Lektion3;

public class BankAccount {
    /*
    10. Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt konto)
    11. Utöka programmet så att man kan skriva ut 	saldot
    12. Utöka programmet så att man kan bestämma 	ett nytt värde för saldo
    13. Utöka programmet så att man kan lägga till 	och ta bort en viss summa ifrån saldot
     */

   int saldo;

    public void setSaldo(int newSaldo){
        saldo = newSaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void withdraw (int amount) {
        saldo=saldo-amount;

    }

    public void deposit(int amount) {
        saldo=saldo+amount;
    }
 public boolean withdrawOK(int amount) {
        if(saldo > amount ) return true;
        else return false;
 }
}









