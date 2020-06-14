import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 13;
        int y = 0;

        try {
            System.out.println((x / y));
        }catch (ArithmeticException e){
            System.out.println("Incercati o operatie imposibila " + e.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println("Valoarea de pe pozitia 3 este " + array[3]);
            System.out.println("Valoarea de pe pozitia 16 este " + array[16]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A aparut o exceptie specifica "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("A aparut exceptia " + e.getMessage());
        }

        String text="Ana";

        if (text == null){
            throw new NullPointerException("Ai uitat sa instantiezi textul");
        }

        try {
            System.out.println("Lungimea textului este " + text.length());
        }catch (NullPointerException e){
            System.out.println("A aparut eroarea: " +e.getMessage());
        }

        String text1 = "Tratam exceptii";

        System.out.println("Caracterul de la pozitia 8 este: " +returCaracter(text1));

        String text2 = "Tratam";

        try {
            System.out.println("Caracterul de la pozitia 8 este: " + returCaracter(text2));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Stringul este mai mic decat pozitia cautata. "+e.getMessage());
        }

        try {
            numerePare();
        }catch (OddNumberException e){
            System.out.println("Numar incorect. "+e.getMessage());
        }


        //Utilizatorul va introduce un cuvant
        //Daca cuvantul incepe cu o vocala aruncam exceptia si prindem VowelExcepton
        //Daca incepe cu consoana afisam Totul e ok

        try{
            cuvant();
        }catch (VowelException e){
            System.out.println("Cuvant gresit. "+e.getMessage());
        }

        




    }

    public static char returCaracter (String text1) throws StringIndexOutOfBoundsException{
        return text1.charAt(8);
    }

    public static void numerePare () throws OddNumberException{
        System.out.println("Va rog introduceti un numar de la tastatura");

        Scanner scanner= new Scanner(System.in);
        int numar = scanner.nextInt();

        if (numar%2==0){
            System.out.println("Felicitari. Ati ales un numar par");
        }else{
            throw new OddNumberException("Ati introdus un numar impar");
        }
    }

    public static void cuvant() throws VowelException{
        System.out.println("Introduceti un cuvant de la tastatura");
        Scanner scanner=new Scanner(System.in);
        String cuvant = scanner.nextLine();
        if (cuvant.startsWith("a")||cuvant.startsWith("e")||cuvant.startsWith("i")||cuvant.startsWith("o")||cuvant.startsWith("u")){
            throw new VowelException("Introduceti un cuvant care nu incepe cu o vocala");
        }else{
            System.out.println("Felicitari. Ati introdus un cuvant corect.");
        }
    }


}
