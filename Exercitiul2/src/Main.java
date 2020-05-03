public class Main {
    public static void main(String[] args) {
        // sa se gaseasca cea mai mare valoare dintr-un vector
        // avem un vector de 10 elemnente intregi

        int[] vector1=new int[] {25, 47, 32, 15, 17, 22, 2, 22, 9, 32};

        int celMaiMareNumar=celMaiMareNumar(vector1);
        System.out.println("Cel mai mare numar este: "+celMaiMareNumar);

    }
    public static int celMaiMareNumar(int[] vector1){
        int celMaiMareNumar=vector1[0];
        for(int i=0; i<vector1.length; i++){
            if (vector1[i]>celMaiMareNumar) {
                celMaiMareNumar=vector1[i];
            }
        }
        return celMaiMareNumar;
    }

}
