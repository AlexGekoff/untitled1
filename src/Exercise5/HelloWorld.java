package Exercise5;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //Input – Använda en färdig klass

        Scanner scan = new Scanner(System.in);
        //String text = scan.nextLine();

        int number = Integer.parseInt(scan.nextLine());
       // System.out.println(number);
        //System.out.println("Skrev in text : " + text);

       HelloWorldPrinter hwp = new HelloWorldPrinter();
       // hwp.print();
        hwp.printManyTimes(number);
    }

}
