package Exercise6;

public class Pet {
    //Skapa en ny klass Pet där vi kan hålla koll på
    //namnen på våra husdjur

        private String name; //attribut
        public Pet(String petName) { //konstruktor
            name = petName;

    }

    // Skapa en ny metod i klassen Pet som skriver ut
    //
    // attributet name
    public void printName() {
        System.out.println("The name of the et is "+ name);
    }

    public String getName() {
            return name;
    }
}
