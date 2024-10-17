package Lektion2;

public class Exercise34 {
    public static void main(String[] args) {

        String string = "Bästa klassen nu är så bra* eller hur ";
        int i = 0;
        //boolean forsätta = string.charAt(i) != '*'; behöver om man ska försätta programm true or false
        while (string.charAt(i) != '*') {
            System.out.print(string.charAt(i));
            i++;
        }

    }
}
