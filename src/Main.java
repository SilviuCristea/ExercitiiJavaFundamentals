public class Main {
    public static void main(String[] args) {
        //o functie care primeste 2 striguri ca parametri si verifica daca al 2 lea string exista in primul string

    String text1="Ana are pere de aceasta data";
    String text2="Ana are pere";

    verificaIncludere(text1, text2);

        //

    }
    public static void verificaIncludere (String text1, String text2){
        if(text1.contains(text2)){
            System.out.println("Textul 2 este inclus in Textul 1");
        }else{
            System.out.println("Textul 2 nu este inclus in textul 1");
        }

    }


}



