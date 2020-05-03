public class Main {
    public static void main(String[] args) {
        //Sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caraterul "i" si acesta se afla pe o pozitie para

        String text="Spears a interpretat „Toxic” în câteva apariții din mass-media printre care ediția din 2004 a premiilor NRJ Music precum și în trei dintre turneele ei";

        int cuvinteCautate=cuvinteCautate(text);
        System.out.println("Numarul de cuvinte cautate este: "+cuvinteCautate);

    }
    public static int cuvinteCautate(String text){
        int cuvinteCautate=0;
        String[] cuvinte=text.split(" ");
        for(int i=0; i<cuvinte.length; i++){
            if(cuvinte[i].length()>2 && cuvinte[i].contains("i") && cuvinte[i].indexOf("i")%2==0){
                cuvinteCautate++;
            }

        }
        return cuvinteCautate;
    }

}
