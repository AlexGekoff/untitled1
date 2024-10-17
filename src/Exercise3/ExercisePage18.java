package Exercise3;

public class ExercisePage18 {
    public static void main(String[] args) {
        //Skriv ut alla tal ifrån 1-100
        //Skriv ut alla jämna tal ifrån 1-100
        System.out.println("Jamn from 1-100");
        int jamn = 2;

        while(jamn <= 100){
            System.out.print(jamn + " ");
            jamn += 2;
        }
        //Skriv ut alla fibonnacci-tal ifrån 1-100.
        // Fibonnacci-tal är de två senaste talen adderat och börjar med 1,
        // 1 som första två tal. Exempel: 1, 1, 2, 3, 5, 8, 13, 21…

        System.out.println();
        System.out.println();
        System.out.println("Numbers from 1-100");
        int number = 1;
        while(number <= 100) {
            System.out.print(number + " ");
            number++;

        }
        System.out.println();
        System.out.println();
        System.out.println("Fibonnacci");

        int first = 1;

        System.out.print(first + " ");

        int second = 1;

        while(second<=100) {
            System.out.print(second + " ");
            int third = first+second;
            first=second;
            second=third;
        }


    }
}
