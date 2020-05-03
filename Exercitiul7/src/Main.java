public class Main {
    public static void main(String[] args) {
        // se da un sir de 7 cuvinte

        //sa se concateneze si sa se afiseze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0

        String[] cuvinte=new String[7];

        cuvinte[0]="ana";
        cuvinte[1]="are";
        cuvinte[2]="mere";
        cuvinte[3]="george";
        cuvinte[4]="merge";
        cuvinte[5]="pe";
        cuvinte[6]="bicicleta";

        cuvinteConcatenate(cuvinte);


    }

    public static void cuvinteConcatenate(String[] cuvinte){

        String cuvinte2="";
        for (int i=1; i<cuvinte.length; i++){
            if (i%3==0){
                cuvinte2=cuvinte2.concat(cuvinte[i]);
            }

        }
        System.out.println(cuvinte2);
    }
}
