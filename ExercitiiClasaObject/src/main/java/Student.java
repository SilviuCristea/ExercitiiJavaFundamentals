public class Student {

    private String nume;
    private String prenume;
    private String adresa;

    public Student (String nume, String prenume, String adresa){
        this.nume=nume;
        this.prenume=prenume;
        this.adresa=adresa;

    }

    public String getNume(){
        return this.nume;
    }
    public String getPrenume(){
        return this.prenume;
    }
    public String getAdresa(){
        return this.adresa;
    }

    public String toString(){
        return (this.nume+" "+this.prenume+" "+this.adresa);
    }

    //Am facut o metoda de compararea celor 2 studenti

    public boolean equals(Student obj){
        if(this.nume.equals(obj.getNume()) && this.prenume.equals(obj.getPrenume()) && this.adresa.equals(obj.getAdresa())){
            return true;
        }else{
            return false;
        }
    }

    //Am facut o metoda hashCode pentru a returna acelasi numar in cazul in care sunt egali (returneaza aceeasi lungime a atributelor)

    public int hasCode(){
        return this.nume.length()+this.prenume.length()+this.adresa.length();
    }



}
