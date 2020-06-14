public class Meniu {

    private String bauturi="cola, pepsi";

    //Pasul 1 - Constructorul clasei trebuie sa fie privat

    private Meniu(){

    }

    //Pasul 2 - Se instantieaza o variabila (obiect) privata si statica de tipul meniu si o vom denumi instance

    private static Meniu instance = new Meniu();

    //Pasul 3 - oferim accesul catre instanta noastra printr-o metoda de tipul get

    public static Meniu getInstance(){
        return instance;
    }

    //Facem un getter pentru atribut
    public String getBauturi() {
        return bauturi;
    }

    //Facem un setter pentru atribut pentru a-l putea modifica
    public void setBauturi(String bauturi) {
        this.bauturi = bauturi;
    }


}
