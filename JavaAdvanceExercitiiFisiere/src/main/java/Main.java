import java.io.*;

public class Main {

    //Sa se citeasca un fisier linie cu linie
    //Sa se scrie intr-un alt fisier liniile care au numar par de cuvinte

    public static void main(String[] args) {


        //Declaram calea de citit si de scris
        String textCitit = "C:\\Users\\Silviu\\FisierDeCitit.txt";
        String textScris = "C:\\Users\\Silviu\\FisierDeScris.txt";

        //Incarcam fisierul de citit cu fileReader

        try {
            FileReader fileReader = new FileReader(textCitit);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(textScris);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String text = bufferedReader.readLine();
            while(text!=null){
                String[] liniiArray = text.split(" ");
                if (liniiArray.length%2==0) {
                    bufferedWriter.write(text);
                    bufferedWriter.newLine();
                }
                text=bufferedReader.readLine();
            }

            //Inchidem scrierea cu close
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println("Eroare "+e.getMessage());
        }







    }

}
