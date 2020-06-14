public class Main {

    public static void main(String[] args) {

        Student student = new Student("Andrei", "Bogdan","Braila");

        // afisam studentul
        System.out.println(student);

        //Sistemul afiseaza "Student@6acbcfc0" - este adresa by default a obiectului student

        //Implementam metoda toString in clasa Student


        // Am creat un nou student identic cu cel de sus

        Student student1=new Student("Andrei", "Bogdan", "Braila");

        //Comparam cei doi studenti

        if (student==student1){
            System.out.println("Aceeasi studenti");
        }else{
            System.out.println("Studenti diferiti");
        }

        //Apare mesajul Studenti diferiti
        //Obiectele se compara cu equals

        if (student.equals(student1)){
            System.out.println("Aceeasi studenti");
        }else{
            System.out.println("Studenti diferiti");
        }

        //Apare acelasi mesaj Studenti diferiti

        //Suprascriem metoda in clasa student

        //Dupa compararea celor 2 studenti apare mesajul Aceeasi studenti

        //Folosim metoda hashCode



    }

}
