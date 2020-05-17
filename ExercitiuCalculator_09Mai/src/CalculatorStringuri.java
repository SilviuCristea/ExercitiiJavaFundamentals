public class CalculatorStringuri extends CalculatorStiintific{

    public CalculatorStringuri() {

    }

    // --concateneaza 2 stringuri
    public String concatenareStringuri(String text1, String text2) {
        return text1.concat(text2);
    }

    // -- verifica daca stringul contine un anumit caracter
    //public boolean verificareCaracter(String text, char a) {
        //if( boolean verificareCaracter == text.contains(a)){
            //return true;
        //}else{
           // return false;
        //}
    //}

    // -- aduna lungimea a 2 stringuri
    public int lungimeTotalaStringuri(String text1, String text2) {
        return text1.length() + text2.length();
    }

    // -- verifica daca lungimea unui string este numar par sau impar
    public boolean lungimeString(String text) {
        if (text.length()%2==0) {
            return true;
        }else{
            return false;
        }
    }

    // -- transforma un string intr-un sir de caractere
    public char[] sirCaractere(String text) {
        return text.toCharArray();
    }

    // -- verifica daca stringul incepe cu o vocala
    public boolean verificareVocala(String text) {
        char primaLitera = text.charAt(0);
        if (primaLitera == 'a' || primaLitera == 'e' || primaLitera == 'i' || primaLitera == 'o' || primaLitera == 'u'){
            return true;
        }else {
            return false;
        }

    }

    // -- numara spatiile dintr-un string
    public int numarSpatii(String text) {
        int numarSpatii=0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)==' '){
                numarSpatii++;
            }
        }
        return numarSpatii;
    }


}
