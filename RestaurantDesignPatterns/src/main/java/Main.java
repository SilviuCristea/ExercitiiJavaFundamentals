public class Main {
    public static void main(String[] args) {
        // Vom exemplifica SINGLETON

        // Meniu meniu=new Meniu(); //Daca vrem sa-l instantiem nu se poate deoarece este private

        //Instantiem un obiect meniu

        Meniu meniu = Meniu.getInstance(); //Am luat o instanta pentru un meniu


        //Printam bauturile din meniu
        System.out.println("Bauturile din meniu sunt: "+meniu.getBauturi());

        //Facem un nou obiect meniu 2

        Meniu meniu2 = Meniu.getInstance();

        //Printam bauturile din meniul 2
        System.out.println("Bauturile din meniul 2 sunt: "+meniu2.getBauturi());

        //Modificam bauturile din meniu
        meniu.setBauturi("mirinda, fanta");

        //Folodind aceeasi instanta daca modificam pentru un obiect se modifica pentru toate obiectele

        System.out.println("Bauturile modificate din meniu sunt: "+meniu.getBauturi());
        System.out.println("Bauturile modificate din meniul 2 sunt: "+meniu2.getBauturi());





    }
}
