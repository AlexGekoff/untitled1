package Lektion2;

public class Exercise18 {


    public static void main(String[] args) {

        //  Skapa ett program där värden på variablerna X och Y läses in. Tilldela variabel A
        //  värdet 2 om X är större än 5 + Y, annars tilldela A värdet 5. Skriv ut variabeln A.

        int x = 3;
        int y = 4;
       // float a1 = 2;
      //  float a2 = 5;

        // if(x> (5 + y) a=2;
        //else a=5;

       /* if (x > (5 + y)) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }

        */
        int a = bigger(x,y);
        System.out.println(bigger(x,y));
    }
    static int bigger(int x, int y) {
        if (x>(5+y)) return 2;
        else return 5;
    }

    }

