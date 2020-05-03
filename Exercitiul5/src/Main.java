public class Main {
    public static void main(String[] args) {
        // sa se afiseze toate cuvintele dintr un text care incep cu litera s sau cu litera d

        // sa se afiseze litera de la pozitia 3 din fiecare cuvant

        String text="Spears a interpretat „Toxic” în câteva apariții din mass-media, printre care ediția din 2004 a premiilor NRJ Music, precum și în trei dintre turneele ei";

        cuvinteCautate(text);

        literaCautata(text);

    }

    public static void cuvinteCautate(String text) {

        String[] cuvinte = text.split(" ");
        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].startsWith("s") || cuvinte[i].startsWith("d")) {
                System.out.println("Cuvintele care incep cu s sau d sunt:");
                System.out.println(cuvinte[i]);
            }
        }
    }

    public static void literaCautata(String text){
        char literaCautata='a';
        String[] cuvinte = text.split(" ");
        for (int i=0; i<cuvinte.length; i++){
            if (cuvinte[i].length()>3){
            System.out.println("Literaele sunt: "+cuvinte[i].charAt(3));
            }
        }
    }

}
