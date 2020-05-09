import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze cosul de cumparaturi dintr-un supermarket

        //Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret

        //Cosul de cumparaturi va fi reprezentat de un sir de produse

        //Sa se afiseze un meniu cu produsele pe care vrem sa le cumparam
            // baat pe ce introduce utilizatorul de la tastatura il introducem in cos

        //Sa calculam costul cosului de cumparaturi
        //Platim pentru cosul de cumparaturi


        //Facem un cos de cumparaturi sub forma unui array
        Produs[] cosCumparaturi = new Produs[10];

        //Facem un meniu de cumparaturi
        System.out.println("Meniu comparaturi");
        System.out.println("1.Mere");
        System.out.println("2.Cutit");
        System.out.println("3.Mustar");
        System.out.println("4.Apa");
        System.out.println("5.Bere");
        System.out.println("6.Vin");

        System.out.println("Va rugam alegeti cumparaturi din meniul nostru");
        System.out.println("Cand terminati cumparaturile apasati tasta 0");

        //Scanam de la tastatura optiunile alese
        Scanner scanner=new Scanner(System.in);
        int optiune=scanner.nextInt();

        //Facem o bucla while pentru a trece prin cosul de cumparaturi in functie de optiunea aleasa
        while (optiune!=0){
            if(optiune==1){
                System.out.println("Ati adaugat Mere");
                Produs mere=new Produs("Mere", 5);
                cosCumparaturi[0]=mere;
            }else if(optiune==2){
                System.out.println("Ati adaugat Cutit");
                Produs cutit=new Produs("Cutit", 12);
                cosCumparaturi[1]=cutit;
            }else if(optiune==3){
                System.out.println("Ati adaugat Mustar");
                Produs mustar=new Produs("Mustar", 2);
                cosCumparaturi[2]=mustar;
            }else if (optiune==4){
                System.out.println("Ati adaugat Apa");
                Produs apa= new Produs("Apa", 3);
                cosCumparaturi[3]=apa;
            }else if (optiune==5){
                System.out.println("Ati adaugat Bere");
                Produs bere=new Produs("Bere",7);
                cosCumparaturi[4]=bere;
            }else if (optiune==6){
                System.out.println("Ati adaugat Vin");
                Produs vin=new Produs("Vin", 30);
                cosCumparaturi[5]=vin;
            }else{
                System.out.println("Nu ati selectat niciun produs");
            }

            //Pentru a opri bucla while
            optiune=scanner.nextInt();
        }
        System.out.println("Va multumim pentru cumparaturi");

        System.out.println("Cumparaturile dumneavoastra sunt:");


        //Citim toate cumparaturile din sirul cosCumparaturi

        for (int i=0; i<cosCumparaturi.length; i++){

            //Folosim un if pentru a nu trece functia for prin obiecte neselectate

            if (cosCumparaturi[i]!=null) {

                //Afisam atributele fiecarui produs din sir
                System.out.println("Produsul este: " + cosCumparaturi[i].getNume());
                System.out.println("La pretul de: " + cosCumparaturi[i].getPret());
            }
        }

        //Afisam costul total al cosului de cumparaturi

            // Declaram o variabila in afara buclei for pentru ca nu vrem sa se reseaze de fiacare data in bucla
            // Daca o declaram in bucla for pleaca de fiecare data de la zero si ne aduna o singura data

        int sumaProduse=0;

        for (int j=0; j<cosCumparaturi.length; j++){
            if (cosCumparaturi[j]!=null) {
                //Adunam pretul produselor
                // "+=" este pentru a aduna toate preturile

                sumaProduse += cosCumparaturi[j].getPret();
            }
        }
        //Afisam in afara buclei for pentru a se afisa o singura data
        System.out.println("Pretul total este: "+sumaProduse);

        System.out.println("S-au platit cumparaturile");

        //Modificam sumaProduse pentr a finaliza procesul de olata (rest 0)
        sumaProduse=0;

        // Sa se reprezinte si produse perisabile
            //Acestea vor avea in plus data expirarii
        //Sa se simuleze un cos de cumparaturi
            // daca utilizatorul selecteaza aceste produse vom afisa mesajul"Produs expirat" si nu-l vom mai adauga in cos
        //Sa adaugam alergeni si can afisam si alergenii la cosul de cumparaturi

        //Vom face 2 cosuri de cumparaturi
            //Produse nonalimentare
            //Produse alimentare (cu data expirare si alergeni)


        Produs[] cosDeCumparaturiNonalimentare=new Produs[10];
        ProduseAlimentare[] cosCumparaturiAlimentare=new ProduseAlimentare[10];

        System.out.println("Meniu produse");
        System.out.println("1.Pere");
        System.out.println("2.Carne");
        System.out.println("3.Lapte");
        System.out.println("4.Matura");
        System.out.println("5.Pronto");
        System.out.println("6.Dero");

        optiune=scanner.nextInt();

        while(optiune!=0){
            if(optiune==1){
                System.out.println("Ati adaugat mere");
                ProduseAlimentare pere = new ProduseAlimentare("Pere", 5, "Zahar", 2020/03/01);

            }


            optiune=scanner.nextInt();
        }



    }
}
