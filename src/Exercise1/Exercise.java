package Exercise1;

public class Exercise {
    public static void main(String[] args) {

        int First = 1;
        int Second = 8;
        int Third = 11;

        int sum = First+Second+Third;
        int median =sum/3;

        System.out.println("The sum is " + sum);
        System.out.println("The median is " + median);

        int hight = 3;
        int lenght =5;
        int area = hight* lenght;
        int cirk = hight*2 + lenght*2;

        System.out.println(area);
        System.out.println(cirk);
        
    }

    public static class helloworld {

        public static void main(String[] args) {
            String text = "hej";
            System.out.println((text + " då"));
            text = text + " då";
            System.out.println(text);

            System.out.println("Hello World!" + " " + "Mer text");
            System.out.print("Without ln");
            System.out.println("With Ln");

        }


    }

    public static class Myinteger {

        public static void main(String[] args) {
            int number = 5;
            int nextNumber = 6;
            System.out.println(number);
            System.out.println(nextNumber);

            number = 5 + 3;
            nextNumber = number + 1;

            System.out.println();
            System.out.println("update");

            System.out.println(number);
            System.out.println(nextNumber);

            number -= 1;
            System.out.println("New operations");
            System.out.println(number);

            number ++;
            System.out.println("New operations with ++");
            System.out.println(number);

        }
    }

    public static class Operations {

        public static void main(String[] args) {
           /* + plus
              - minus
              * gånger
                    / delat med
                    % modulus (resten en division)
            7%3=1
            25%5=0
            137%10=7

            */

            int number = 7 % 3;
            int nextNumber = 25 % 5;
            int newNumber = 137 % 10;

            System.out.println(number);
            System.out.println(nextNumber);
            System.out.println(newNumber);

           /* number = nextNumber * 3+2;
            nextNumber = number/7;

            System.out.println(number);
            System.out.println(nextNumber);

            */

        }

    }
}
