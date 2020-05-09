public class CalculatorStiintific extends Calculator {

    public CalculatorStiintific() {

    }

    // Un numar ridicat la puterea altui numar
    public double ridicareLaPutere(int a, int b) {
        return Math.pow(a, b);
    }

    // Radical dintr-un numar
    public double radical(int a) {
        return Math.sqrt(a);
    }

    // Logaritm in baza 10 dintr-un numar
    public double logaritm10(int a) {
        return Math.log10(a);
    }

    // Logaritm dintr-un numar
    public double logaritm(int a) {
        return Math.log(a);
    }


}
