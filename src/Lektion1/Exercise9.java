package Lektion1;

public class Exercise9 {
    public static void main(String[] args) {

        //Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
        // skall beräknas och skrivas ut. (pi = 3.14).

       float radius = 4.0f;
       float pi = 3.14f;

       float diametr = 2*radius;
       float circumference = 2*pi*radius;
       float area = pi*radius*radius;

        System.out.println("The diametr of cirkle is " + diametr);
        System.out.println("The circumference of cirkle is " + circumference);
        System.out.println("The area of cirkle is " + area);

    }
}
