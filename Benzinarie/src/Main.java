import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze o bemzinarie

        //Va avea motorina si benzina

        //din ficare va avea 1000 litri motorina si 500 litri benzina
        //va avea pret

        //de fiecare data cand cineva va cumpara va scadea iar cand aceasta va fi <10litri se afis mesaj

        //cand cineva cumpara se va calcula pretul de plata

        // Vom avea un obiect cumparator
        //va avea o suma de bani
        //va putea plati cumparaturile
        //suma platita se va scade din suma cumparatorului

        //persoana poate plati cu o suma la care sa primeasca rest

        //daca cumparatorul nu are bani se afiseaza chemam politia


        //Facem un obiect benzinarie

        GasStation omv = new GasStation(50, 5, 50, 6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti numele");

        String name = scanner.nextLine();

        Cumparator cumparator = new Cumparator(name, 300);

        System.out.println("Va rugam alegeti o optiune");
        System.out.println("1.Motorina");
        System.out.println("2.Benzina");

        int optiune = 0;
        optiune = scanner.nextInt();

        int cantitate=0;
        System.out.println("Introduceti cantitatea dorita");
        cantitate=scanner.nextInt();



        while (optiune != 9) {
            if(optiune==1){
                System.out.println("Ati ales Motorina");
                int pretTotal= omv.sellM(5);
                String rezultatTranzactie=cumparator.tranzactieMotorina(pretTotal);
                if (rezultatTranzactie.startsWith("Nu")){
                    String incasare=omv.incaseazaBani(pretTotal/2, pretTotal);
                }else{
                    String incasare=omv.incaseazaBani(pretTotal,pretTotal);
                    System.out.println("Rezultatul tranzactiei este: "+incasare);
                }
            }else if(optiune==2){

                System.out.println("Ati ales Benzina");
            }else{

                System.out.println("Nu regasim optiunea aleasa");
            }

            optiune=scanner.nextInt();
        }


    }
}



