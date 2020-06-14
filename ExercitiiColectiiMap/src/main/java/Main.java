import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Sa se citeasca dintrun fisier numele prenumele clasa si optional(materie)
        //Sa se grupeze in colectii diferite elevii in functie de clasa si in functie de optional


        try {
            String filePath = "C:\\Users\\Silviu\\FisiereExercitii\\Elevi.txt";

            //Citim informatiile din fisier

            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Citim primul rand si stocam informatiile intr-un text (o variabila tip String)

            String text = bufferedReader.readLine();

            // Creem map pentru grupe si pentru optional

            Map<String, ArrayList<Student>> groupsMap = new HashMap<String, ArrayList<Student>>();

            Map<String, ArrayList<Student>> optionalMap = new HashMap<String, ArrayList<Student>>();

            //Pregatim mapul pentru clasa si optional (instantiem fiecare Map list)

            groupsMap.put("10", new ArrayList<Student>());
            groupsMap.put("11", new ArrayList<Student>());
            groupsMap.put("12", new ArrayList<Student>());

            optionalMap.put("MatematicaAplicata", new ArrayList<Student>());
            optionalMap.put("Informatica", new ArrayList<Student>());
            optionalMap.put("Germana", new ArrayList<Student>());

            //Citim fiecare linie din fisier cu while
            //Impartim informatiile de pe fiecare linie intr-un array
            //Creem un obiect student cu informatiile din array (atributele studentului)

            System.out.println("Elevii din scoala sunt:");

            while(text!=null){
                String[] array = text.split(";");

                Student student = new Student(array[0], array[1], array[2],array[3]);

                //Grupam studentii dupa clasa (introdusi in groupsMap)

                if (student.getGroup().equals("10")){
                    //Am adaugat studentii in categoria clasei a 10-a cu add deoarece este un array (ArrayList)
                    groupsMap.get("10").add(student);

                }else if(student.getGroup().equals("11")){
                    groupsMap.get("11").add(student);
                }else{
                    groupsMap.get("12").add(student);
                }


                //Grupam studentii dupa optional (introdusi in optionalMap)
                if (student.getOptional().equals("MatematicaAplicata")){
                    optionalMap.get("MatematicaAplicata").add(student);
                }else if (student.getOptional().equals("Informatica")){
                    optionalMap.get("Informatica").add(student);
                }else{
                    optionalMap.get("Germana").add(student);
                }

                //Citim urmatorul rand
                text = bufferedReader.readLine();
            }

            System.out.println();
            //Afisam toti studentii de la informatica
            System.out.println("Elevii de la Informatica sunt:");

            //Am creeat un arrayList cu studentii de la Info
            ArrayList<Student> studentiInfo = optionalMap.get("Informatica");
            //Citim arayyList-ul cu for
            for(Student student1 : studentiInfo){
                System.out.println(student1);
            }

            System.out.println();
            //Afisam studentii din clasa 11-a
            System.out.println("Studentii din clasa a11-a sunt:");
            ArrayList<Student> studenti11 = groupsMap.get("11");
            for (Student studentA11 : studenti11){
                System.out.println(studentA11);
            }

            System.out.println();
            //Afisam studentii de la MateAplicata

            System.out.println("Elevii de la Matematica Aplicata sunt:");
            ArrayList<Student> studentiMate = optionalMap.get("MatematicaAplicata");
            for (Student studentiMateApl : studentiMate){
                System.out.println(studentiMateApl);
            }

            System.out.println();
            //Afisam studentii din clasa 10-a

            System.out.println("Studentii din clasa a10-a sunt:");
            ArrayList<Student> studenti10 = groupsMap.get("10");
            for (Student studentA10 : studenti10){
                System.out.println(studentA10);
            }





        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
