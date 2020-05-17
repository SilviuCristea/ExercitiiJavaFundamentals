public class Cumparator {
    private String name;
    private int mony;

    public Cumparator(String name, int mony){
        this.name=name;
        this.mony=mony;
    }
    public Cumparator(){

    }
    public String getName(){
        return name;
    }
    public int getMony(){
        return mony;
    }

    public String tranzactieBenzina(int baniDePlatit){
        if (baniDePlatit>this.mony){
            return "Nu am suficienti bani";
        }else {
            this.mony -= baniDePlatit;
            return "Mai avem " + this.mony;
        }

    }
    public String tranzactieMotorina(int baniDePlatit){
        if (baniDePlatit>this.mony){
            return "Nu am suficienti bani";
        }else {
            this.mony -= baniDePlatit;
            return "Mai avem " + this.mony;
        }
    }


}


