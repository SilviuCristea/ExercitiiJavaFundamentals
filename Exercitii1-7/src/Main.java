public class Main {
    public static void main(String[] args) {

        // se da un sir de 7 cuvinte
                //sa se concateneze si sa se afiseze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0

        //o functie care primeste 2 striguri ca parametri si verifica daca al 2 lea string exista in primul string

        String text1="Ana are mere si nu da la nimeni";
        String text2="Ana are mere";

        verificareString(text1, text2);

        // sa se gaseasca cea mai mare valoare dintr-un vector
            // avem un vector de 10 elemnente intregi

        // se da un text ; sa se numere cuvintele care au lungimea impara si se termina cu litera e

        //Sa se numere toate cuvintele dintr un text care au lungimea mai mare decat 2, contin caraterul "i" si acesta se afla pe o pozitie para

        // sa se afiseze toate cuvintele dintr un text care incep cu litera s sau cu litera d
            // sa se afiseze litera de la pozitia 3 din fiecare cuvant

        //Se da un sir de caractere
            //Sa se afiseze in ordinea inversa

    }
    public  static void verificareString (String text1, String text2){


        if (text1.contains(text2)==true){
            System.out.println("Al doilea string este in primul string");
        }else {
            System.out.println("Al doilea string nu este in primul string");
        }

    }

}
