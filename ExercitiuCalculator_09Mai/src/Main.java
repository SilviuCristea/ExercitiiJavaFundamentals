import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire, scadere) prin POO

    Calculator calculator = new Calculator();


    System.out.println("Adunarea este: "+calculator.Adunare(5, 7));

    System.out.println("Scaderea este: "+calculator.Scadere(5, 7));

    System.out.println("Inmultirea este: "+calculator.Inmultire(5, 7));

    System.out.println("Impartirea este: "+calculator.Impartire(5, 7));

    //De aici invatam sa citim de la tasatura

        //Declaram un obiect tip scaner (exista clsa predefinita "Scaner")

        // si instantiem un obiect tip scaner

        Scanner scanner=new Scanner(System.in);

        //Citeste primul numar
        System.out.println("Va rugam introduceti primul numar");

        //Declaram primul numar introdus
        int primulNumar = scanner.nextInt();

        //Citeste al doilea numar
        System.out.println("Va rugam introduceti al doilea numar");

        //Declaram al doilea numar
        int alDoileaNumar= scanner.nextInt();

        // Verificam ca numerele introduse sunt corecte (optional)
        System.out.println("Numerele introduse sunt: "+primulNumar+" "+alDoileaNumar);

        //Afisam rezultatele cu ajutorul obiectului calculator creat mai sus
        System.out.println("Rezultatul adunarii este: "+calculator.Adunare(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul scaderii este: "+calculator.Scadere(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul inmultirii este: "+calculator.Inmultire(primulNumar, alDoileaNumar));

        System.out.println("Rezultatul impartirii este: "+calculator.Impartire(primulNumar, alDoileaNumar));






    }
}
