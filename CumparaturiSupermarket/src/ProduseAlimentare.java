import java.util.Calendar;
import java.util.Date;

public class ProduseAlimentare extends Produs{

    private String alergeni;
    private Date dataDeExpirare;

    public ProduseAlimentare(String nume, int pret,String alergeni, Date dataDeExpirare){
        this.nume=nume;
        this.pret=pret;
        this.alergeni=alergeni;
        this.dataDeExpirare=dataDeExpirare;
    }

    public ProduseAlimentare(){

    }

    public String getAlergeni(){
        return alergeni;
    }
    public Date getDataDeExpirare(){
        return dataDeExpirare;
    }

}
