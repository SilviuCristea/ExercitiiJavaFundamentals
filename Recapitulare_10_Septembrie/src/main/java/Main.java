import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*int[] arrayInts = {1,2,9,3,4,5,5,9,9,10};
        int count=0;
        Arrays.sort(arrayInts);
        for (int i = 0; i < arrayInts.length-1; i++) {
            if (arrayInts[i] == arrayInts[i+1]) {
                count++;
            }
        }
        System.out.println("Duplicatele sunt in numar de: "+count);



       // Calculam maximul numar al arrayului initial pentru a putea face un array nou in care sa contina fiecare element pe pozitia lui
        // Ex: 1 la 1 , 105 pe poz 105

        int max = 0;
        int count2=0;
        for (int i = 0; i < arrayInts.length; i++) {
            if (arrayInts[i]>max) {
                max=arrayInts[i];
            }
        }

        int[] newArray = new int[max+1]; // Noul array trebuie sa contina numarul maxim din primul array plus 1
        for (int i = 0; i < arrayInts.length; i++) {

            if (newArray[arrayInts[i]]==arrayInts[i]){
                count2++;
            }else{
                newArray[arrayInts[i]]=arrayInts[i];
            }
        }
        System.out.println(count2);

        /*Exercitiu 2
        Se citesc de la tastatura 10 numere.
                Sa se stocheze intr-o colectie.
                Sa se elimine numerele pare.*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti 10 numere");

        int number = scanner.nextInt();

        List<Integer> numberList = new LinkedList<>();
        numberList.add(number);

        while(numberList.size()<=9 && number != 0) {
            number = scanner.nextInt();
            numberList.add(number);
        }
        System.out.println(numberList);

        //Metoda de parcurge o lista ci un Iterator
        //Iteratorii ne ajuta sa parcurgem o lista cu elemente de acelasi tip intr-un mod sigur
        //Ne ajuta sa ne asiguram ca in timp ce parcurgem lista aceasta nu este modificata
        //Iteratori de tip FailSafe - in momentul in care se instantiaza un iterator acesta cloneaza colectia si o pastreaza pentru el iterand doar prin clona
        //                 FailFast - daca in timp ce itereaza printr-o lista aceasta este modificata iteratorul va arunca o exceptie ConcurentModificationException, oprind rularea programului


        Iterator<Integer> iterator = numberList.listIterator();
        while(iterator.hasNext()){
            int numberIterat = iterator.next();
            if (numberIterat %2 == 0){
                iterator.remove();
            }
            //numberList.add(60); - daca modificam lista ne arunca exceptia de mai sus
        }

        System.out.println(numberList);


        /*Exercitiu 3
        Se citesc de la tastatura 10 numere.
                Sa se stocheze intr-o colectie.
                Sa se elimine numerele de pe pozitiile impare.*/


        /*System.out.println("Va rugam introduceti 10 numere");
        int number2 = scanner.nextInt();

        List<Integer> numberList2 = new ArrayList<>();
        numberList2.add(number2);

        while(numberList2.size()<=9 & number2 != 0){
            number2= scanner.nextInt();
            numberList2.add(number2);
        }

        System.out.println(numberList2);

        for (int i = 0; i <numberList2.size() ; i++) {
            if (numberList2.indexOf(i) %2 !=0){
                numberList2.remove(numberList2.get(i));
            }
        }

        System.out.println(numberList2);*/

        /* Un palindrom este un cuvant care este acelasi indiferent de unde il citesti (ana, apa)
        Sa se scrie un program care are un array de caractere si verifica daca elemntele din array formeaza un cuvant palindrom
        Nu ne folosim de oboecte sau metode din Java.
         */

        String text = "ana";
        char[] splitText = text.toCharArray();
        int j = splitText.length-1;


        for (int i = 0; i < splitText.length-1; i++) {
            if (splitText[i] == splitText[j]) {
                i++;
                j--;
                System.out.println("Palindrom");
            }else{
                System.out.println("Nu e palindrom");
            }
        }


    }
}
