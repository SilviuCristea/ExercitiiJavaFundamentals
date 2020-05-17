public class ArreysOperations {

    public int lungimeArray(int[] array){
        return array.length;
    }

    public int numereMaiMari(int[] array){
        int suma=0;
        for (int i = 0; i <array.length; i++) {
            if (array[i]>5) {
              suma++;
            }
        }
        return suma;
    }
}
