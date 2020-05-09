public class CalculatorStringuri extends CalculatorStiintific{

    public CalculatorStringuri(){

    }
    // --concateneaza 2 stringuri
    public String concatenareStringuri(String text1, String text2){
        return text1.concat(text2);
    }

    // -- verifica daca stringul contine un anumit caracter
    public boolean verificareCaracter(String text){
        return text.contains();
    }

    // -- aduna lungimea a 2 stringuri
    public int lungimeTotalaStringuri(String text1, String text2){
        return text1.length()+text2.length();
    }

    // -- verifica daca lungimea unui string este numar par sau impar
    public int lungimeString(String text){
        return text.length();
    }

    // -- transforma un string intr-un sir de caractere
    public char[] sirCaractere(String text) {
        return text.toCharArray();
    }

    // -- verifica daca stringul incepe cu o vocala
    public boolean verificareVocala(String text){
        return text.startsWith();
    }

    // -- numara spatiile dintr-un string
    public int numarSpatii(String text){
        return text.codePointCount();
    }



}
