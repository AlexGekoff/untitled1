package Lektion1;

public class Exercise10 {
    public static void main(String[] args) {
      //  Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
        // Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
        //i Celsius skrivs ut.


        float fahrenheit = 12;
        float celsius = 5.0f/9.0f*(fahrenheit-32);

        System.out.println("Du har skrivit in temperaturen Fahrenheit " + fahrenheit);
        System.out.println("Det är motsvarande temperatur i celsius är " + celsius);

    }
}
