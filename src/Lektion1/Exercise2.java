package Lektion1;

public class Exercise2 {
    public static void main(String[] args) {

  //En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
  //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
  //Försäljningssumman ska läsas in.

        int salary = 8000;
        double percentage = 9;
        double sales = 115;

        double result = (percentage*sales)/100 + salary;

        System.out.println("Salary is " + result);

    }
}
