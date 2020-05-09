import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire, scadere) prin POO

        Calculator calculator = new Calculator();


        System.out.println("Adunarea este: " + calculator.Adunare(5, 7));

        System.out.println("Scaderea este: " + calculator.Scadere(5, 7));

        System.out.println("Inmultirea este: " + calculator.Inmultire(5, 7));

        System.out.println("Impartirea este: " + calculator.Impartire(5, 7));

        //De aici invatam sa citim de la tasatura

        //Declaram un obiect tip scaner (exista clsa predefinita "Scaner")

        // si instantiem un obiect tip scaner

        Scanner scanner = new Scanner(System.in);

        //Citeste primul numar
        System.out.println("Va rugam introduceti primul numar");

        //Declaram primul numar introdus
        int primulNumar = scanner.nextInt();

        //Citeste al doilea numar
        System.out.println("Va rugam introduceti al doilea numar");

        //Declaram al doilea numar
        int alDoileaNumar = scanner.nextInt();

        // Verificam ca numerele introduse sunt corecte (optional)
        System.out.println("Numerele introduse sunt: " + primulNumar + " " + alDoileaNumar);

        //Afisam rezultatele cu ajutorul obiectului calculator creat mai sus
        System.out.println("Rezultatul adunarii este: " + calculator.Adunare(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul scaderii este: " + calculator.Scadere(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul inmultirii este: " + calculator.Inmultire(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul impartirii este: " + calculator.Impartire(primulNumar, alDoileaNumar));

        // Sa se creeze un calculator stiintific care sa faca si urmatoarele operatii:
        // Un numar ridicat la puterea altui numar
        // Radical dintr-un numar
        // Logaritm in baza 10 dintr-un numar
        // Logaritm dintr-un numar

        //Metoda 1 - afisare directa

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();

        System.out.println("Ridicare la putere: " + calculatorStiintific.ridicareLaPutere(2, 3));

        System.out.println("Radicalul este: " + calculatorStiintific.radical(9));

        System.out.println("Logaritm in baza 10 este: " + calculatorStiintific.logaritm10(22));

        System.out.println("Logaritul este: " + calculatorStiintific.logaritm(22));

        //Metoda 2

        //Declaram o variabila pentru ridicarea la putere si apelam variabila

        double ridicareLaPutere = calculatorStiintific.ridicareLaPutere(2, 3);

        System.out.println("Rezultatul ridicarii la putere este: " + ridicareLaPutere);

        // Metoda 3 - cu citire de la tastatura

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Va rugam introduceti primul numar pentru ridicare la putere");

        primulNumar = scanner1.nextInt();

        System.out.println("Va rugam introduceti al doilea numar pentru ridicare la putere");

        alDoileaNumar = scanner1.nextInt();

        System.out.println("Rezultatul ridicarii la putere al numerelor " + primulNumar + " " + alDoileaNumar + " este: " + calculatorStiintific.ridicareLaPutere(primulNumar, alDoileaNumar));

        System.out.println("Va rugam sa introduceti numarul pentru calcularea radicalului");

        primulNumar = scanner1.nextInt();

        System.out.println("Rezultatul radicalului numarului " + primulNumar + " este: " + calculatorStiintific.radical(primulNumar));

        System.out.println("Va rugam sa introduceti numarul pentru calcularea logaritmului in baza 10");

        primulNumar = scanner1.nextInt();

        System.out.println("Rezultatul log10 al numarului " + primulNumar + " este: " + calculatorStiintific.logaritm10(primulNumar));

        System.out.println("Rezultatul logaritmului numarului " + primulNumar + " este: " + calculatorStiintific.logaritm(primulNumar));

        //Va rugam introduceti doua numere

        //Afisam numerele

        //Sa se afiseze meniul

        //1.Adunarea
        //2.Inmultire
        //3.Radicalul
        //4.Scadere

        //Afisam mesajul Alegeti o optiune

        //In functie de optiunea aleasa sa facem operatia respectiva
        //Daca operatia presupune folosirea unui singur nr sa afiseze operatia pentru ambele numere

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Va rugam introduceti cele 2 numere");

        primulNumar = scanner2.nextInt();

        alDoileaNumar = scanner2.nextInt();

        System.out.println("Numerele introduse sunt: " + primulNumar + " " + alDoileaNumar);

        System.out.println("Meniu");

        System.out.println("1.Adunarea");
        System.out.println("2.Inmultire");
        System.out.println("3.Radicalul");
        System.out.println("4.Scadere");

        System.out.println("Va rugam alegeti o optiune");

        //Declaram o variabila optiune
        int optiune = 0;

        //Utilizatirul introduce o optiune de la tastatura

        optiune = scanner2.nextInt();

        //Facem alegerea optiunii pana cand apasam tasta 9

        //Daca utilizatorul introduce orice numar in afara de 9 ruleaza instructiunile din if pana cand utilizatorul introduce tasta 9
        while (optiune != 9) {
            if (optiune == 1) {
                System.out.println("Ati ales optiunea adunare");
                System.out.println("Rezultatul adunarii est: " + calculatorStiintific.Adunare(primulNumar, alDoileaNumar));
            } else if (optiune == 2) {
                System.out.println("Ati ales optiunea inmultire");
                System.out.println("Rezultatul inmultirii est: " + calculatorStiintific.Inmultire(primulNumar, alDoileaNumar));
            } else if (optiune == 3) {
                System.out.println("Ati ales optiunea radical");
                System.out.println("Rezultatul radicalului primului numar este: " + calculatorStiintific.radical(primulNumar));
                System.out.println("Rezultatul radicalului al doilea numar este: " + calculatorStiintific.radical(alDoileaNumar));
            } else if (optiune == 4) {
                System.out.println("Ati ales optiunea scadere");
                System.out.println("Rezultatul scaderii este: " + calculatorStiintific.Scadere(primulNumar, alDoileaNumar));
            } else {
                System.out.println("Nu regasim optionea aleasa de dumneavoastra");
            }
            optiune=scanner2.nextInt();
        }
        System.out.println("Ne pare rau. Ati apasat tasta 9 si am iesit din program");


    }


}

