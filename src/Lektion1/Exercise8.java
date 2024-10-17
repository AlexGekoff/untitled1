package Lektion1;

public class Exercise8 {
    public static void main(String[] args) {

        //Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        //Rektangelns sidor ska läsas in.

        float length =2.0f;
        float width  =4.0f;
        float area = length*width;
        float perimeter = 2*(length+width);

        System.out.println("The area of rectangle is " + area);
        System.out.println("The perimeter of rectangle is " + perimeter);

    }
}
