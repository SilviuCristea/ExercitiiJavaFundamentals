public class Main {
    public static void main(String[] args) {

        // se da un text ; sa se numere cuvintele care au lungimea impara si se termina cu litera e

        String text="Spears a interpretat „Toxic” în câteva aparițiie din mass-media printre care ediția din 2004 a premiilor NRJ Music precum și în trei dintre turneele ei";

        cuvinteCautate(text);

    }
    public static void cuvinteCautate(String text){

        int x=0;
        String[] rezultatSplit=text.split(" ");
        for(int i=0; i<rezultatSplit.length; i++){
            if(rezultatSplit[i].length() %2!=0 && rezultatSplit[i].endsWith("e")){
              x++;
            }
        }
        System.out.println("Numarul de cuvinte este: "+x);
    }

}
