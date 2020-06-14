import java.io.*;

public class Main {

    //sa se citeasca fiecare rand dintr-un fisier
    //Sa se afiseze numarul de cuvinte dintr-un rand

    public static void main(String[] args) {

        //Declaram calea catre fisierul din care trebuie sa citim

        String filePath = "C:\\Users\\Silviu\\Fisier de citit.txt";

        //Incarcarea fisierului in program
        //Se face cu ajutorul lui FileReader

        //Am tratat 2 exceptii
        try {
            FileReader fileReader = new FileReader(filePath);

            //Incepem citirea din fisier linie cu linie
            //Obiectul folosit pentru citirea linie cu linie se numeste BufferedReader

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();

            //Citim toate liniile din fisier

            while (text != null) {
                System.out.println("Linia citita este: " + text);
                String[] wordArray = text.split(" ");
                System.out.println("Numarul de cuvinte pe linie este: " + wordArray.length);
                text = bufferedReader.readLine();
            }

            //Cum putem scrie intr-un fisier

            //Declaram calea unde trebuie sa sciem

            String fileToWhrite = "C:\\Users\\Silviu\\Fisier de scris.txt";

            //Incarcam fisierul in program cu ajutorul lui FileWriter si BufferedWriter

            FileWriter fileWriter = new FileWriter(fileToWhrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String linieDeScris = "Ana este acasa";
            String linieDeSris2 = "Ana a plecat";
            bufferedWriter.write(linieDeScris);
            bufferedWriter.write(linieDeSris2);

            //Inchidem scrierea cu flush si close

            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (IOException e) {
            System.out.println("A aparut o exceptie " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("A aparut o eroare "+e.getMessage());
        }



    }
}


