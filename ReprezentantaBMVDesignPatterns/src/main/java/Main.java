public class Main {
    public static void main(String[] args) {

        //Am creat clasa Car si am creat mai multe obiecte masini BMV diferentiate prin culoare

        /*Car BMW1 = new Car("BMW", "X4", "Benzina", "Red");
        Car BMW2 = new Car("BMW", "X4", "Benzina", "Blue");
        Car BMW3 = new Car("BMW", "X4", "Benzina", "Black");
        Car BMW4 = new Car("BMW", "X4", "Benzina", "Yellow");
        Car BMW5 = new Car("BMW", "X4", "Benzina", "Green");
        Car BMW6 = new Car("BMW", "X4", "Benzina", "Black");
        Car BMW7 = new Car("BMW", "X4", "Benzina", "Yellow");
        Car BMW8 = new Car("BMW", "X4", "Benzina", "Green");
        Car BMW9 = new Car("BMW", "X4", "Benzina", "Black");
        Car BMW10 = new Car("BMW", "X4", "Benzina", "Yellow");
        Car BMW11 = new Car("BMW", "X4", "Benzina", "Green");*/

        //Folosim patternul PROTOTIPE pentru a crea un obiect pe care il putem modifica mai tarziu
        //Pentru a putea folosi PROTOTIPE avem nevoie sa suprascriem metoda CLONE (clasa Object)


        Car BMW = new Car("BMW", "X4", "Benzina", "Red");

        //Clonam obiectul BMW pentru a putea crea mai multe obiecte de tip BMW

        Car BMW2 = BMW.clone();    //Am clonat un nou obiect
        BMW2.setColor("White");    //Am modificat un atribut - culoarea
        Car BMW3 = BMW.clone();    //Obiect identic cu cel declarat initial

        //Daca vrem sa facem mai multe modificari mai bine declaram un nou obiect

        Car Audi = new Car("Audi", "A4", "Benzina", "Red");
        Car Audi2 = Audi.clone();
        Audi2.setColor("Black");





    }
}
