public class GasStation {

    //Atribute
    private int benzina;
    private int motorina;
    private int pretB;
    private int pretM;

    public GasStation(int motorina, int pretM, int benzina, int pretB){
        this.benzina=benzina;
        this.motorina=motorina;
        this.pretB=pretB;
        this.pretM=pretM;
    }
    public GasStation(){

    }
    //Atribite
    public int getMotorina(){
        return motorina;
    }
    public int getBenzina(){
        return benzina;
    }
    public int getPretB(){
        return pretB;
    }
    public int getPretM(){
        return pretM;
    }
    //Comportamente
    public int sellM(int motorinaVanduta){
        //intr-o clasa pentru a apela un atribut il apelam cu this.nume atribut
        int pretTotal=0;
        if (this.motorina<10 || this.motorina<motorinaVanduta){
            System.out.println("Nu avem motorina in stoc");
        }else{
            this.motorina-=motorinaVanduta;
            pretTotal=motorinaVanduta*pretM;
        }
        return pretTotal;
    }
    public int sellB(int benzinaVanduta){
        int pretTotal=0;
        if (this.benzina<10 || this.benzina<benzinaVanduta){
            System.out.println("Nu avem benzina in stoc");
        }else{
            this.benzina-=benzinaVanduta;
            pretTotal=benzinaVanduta*pretB;
        }
        return pretTotal;
    }
    public String incaseazaBani(int money, int pretTotal){
        if (money==pretTotal){
            return "Multumin";
        }else if (money>pretTotal){
            return "Restul este"+(money-pretTotal)+" Multumim";
        }else{
            return "Chemam politia";
        }

    }

}
