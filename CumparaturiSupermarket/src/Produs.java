public class Produs {

    // Protected este folosit in cazul in care este o clasa parinte
    //Daca este o clasa care nu va fi mostenita modificam accesul in "private"
    protected int pret;
    protected String nume;

    public Produs(String nume, int pret){
        this.nume=nume;
        this.pret=pret;
    }
    public Produs(){

    }

    //Am modificat accesul pentru nume si pret in cazul in care va fi mostenita clasa produs (ex: produse proaspete)
    //Modificam accesul pentru a exporta pretul si numele in exterior cu "getter"

    public String getNume(){
        return nume;
    }
    public int getPret(){
        return pret;
    }
}
