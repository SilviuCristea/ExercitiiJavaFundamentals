public class Main {
    public static void main(String[] args) {
        //Se da un sir de caractere
        //Sa se afiseze in ordinea inversa

        char[] caractere=new char[10];
        caractere[0]='a';
        caractere[1]='b';
        caractere[2]='c';
        caractere[3]='d';
        caractere[4]='e';
        caractere[5]='f';
        caractere[6]='g';
        caractere[7]='h';
        caractere[8]='i';
        caractere[9]='j';

        caractereInversate(caractere);


    }

    public static void caractereInversate(char[] caractere){
        for (int i=caractere.length-1; i>0; i--){
            System.out.println(caractere[i]);
        }


    }
}
