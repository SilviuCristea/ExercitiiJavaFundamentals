import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Sa se citeasca dintr-un fisier informatii despre angajatii unei companii
            //nume, prenume, departament (dep IT si dep vanzari)
        //Dupa ce i-am citit se vor pune in set-uri deparate dupa departament
        //Afisam cele 2 set-uri

        Set<Employee> itSet = new HashSet<Employee>();
        Set<Employee> saleSet = new HashSet<Employee>();


        try {
            String fisierAngajati = "C:\\Users\\Silviu\\FisierAngajati.txt";

            FileReader fileReader = new FileReader(fisierAngajati);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String textDeCitit = bufferedReader.readLine();

            while (textDeCitit != null) {
                String[] textArray = textDeCitit.split(",");
                Employee employee = new Employee(textArray[0], textArray[1], textArray[2]);

                if (employee.getDepartment().equals("IT")){
                    itSet.add(employee);
                }else{
                    saleSet.add(employee);
                }

                textDeCitit = bufferedReader.readLine();
            }

            System.out.println("Angajatii din IT sunt:");
            for(Employee employee : itSet){
                System.out.println(employee);
            }

            System.out.println("Angajatii din vanzari sunt");
            for (Employee employee : saleSet){
                System.out.println(employee);
            }



        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Tutoriale cu colectii:

        //https://www.geeksforgeeks.org/collections-in-java-2/

        //https://beginnersbook.com/java-collections-tutorials/

        //https://www.programiz.com/java-programming/collections

        //https://howtodoinjava.com/java-collections/



    }
}
