public class Trainee {
    private String name;
    private int stamina=200;
    private int strenght=50;

    public Trainee(String name){
        this.name=name;
    }


    public Trainee(){

    }

    public void cardio(){
        System.out.println("Am inceput cardio");
        System.out.println("Ard 300 calorii");
        stamina-=30;
        strenght+=10;
    }
    public void bodyPump(){
        System.out.println("Am inceput body pump");
        System.out.println("Ard 500 calorii");
        stamina-=50;
        strenght+=10;
    }

    public void box(){
        System.out.println("Am inceput box");
        System.out.println("Ard 250 calorii");
        stamina-=70;
        strenght+=10;
    }

    public String getName(){
        return name;
    }
    public int getStamina(){
        return stamina;
    }
    public int getStrenght(){
        return strenght;
    }
}
