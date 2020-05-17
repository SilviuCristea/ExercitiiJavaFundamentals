import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze o sedinta de traning personal

        //Avem un Trainee (elev) pentru care avem
        //Nume
        //Stamina
        //Strenght
        //Se antreneaza luni miercuri si vineri
        //O sa porneasca cu stamina 1000
        //de fiecare data stamina scade
        //de fiecare data strenght creste
        //porneste cu puterea 50
        //luni cardio
        //arde 500 calorii
        //etc


        // Citim de la tastatura numele trainee ului
        System.out.println("Va rugam introduceti numele trinee-ului");

        Scanner name=new Scanner(System.in);
        String nume=name.nextLine();
        //Utilizatorul va introduce ziua saptamanii

        Scanner zi = new Scanner(System.in);

        System.out.println("Va rugam introduceti ziua curenta");



// Facem un obiect trainee
        Trainee ion = new Trainee(nume);

        //citim de la tastatura ziua curenta
        String ziCurenta = zi.nextLine();

        //verificam daca ce tastam este in cerinta problemei

        while ((ziCurenta.equals("luni") || ziCurenta.equals("miercuri") || ziCurenta.equals("vineri")) && ion.getStamina() > 0) {
            // Folosim switch pentru a trece prin zilele de antrenament

            switch (ziCurenta) {
                case "luni":
                    ion.cardio();
                    System.out.println("Stamina ajuns la "+ion.getStamina());
                    break;
                case "miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina ajuns la "+ion.getStamina());
                    break;
                case "vineri":
                    ion.box();
                    System.out.println("Stamina ajuns la "+ion.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta");
                    break;
            }
            //Pentru a inchide bucla while mai citim o data de la tastatura
            ziCurenta=zi.nextLine();
        }
        if(!ziCurenta.equals("luni")||!ziCurenta.equals("miercuri")||!ziCurenta.equals("vineri")) {
            System.out.println("Nu se face antrenament in aceasta zi " + ziCurenta);
        }
        if (ion.getStamina()<=0){
            System.out.println(ion.getName()+" a obosit");
        }
        System.out.println("Puterea lui "+ ion.getName()+" a aluns la "+ion.getStrenght());

    }
}
