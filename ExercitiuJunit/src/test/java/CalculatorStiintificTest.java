import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStiintificTest {

    CalculatorStiintific calculatorStiintific=new CalculatorStiintific();


    @Test
    public void adunareTest(){
        int a=5;
        int b=3;
        int result=calculatorStiintific.adunare(a,b);

        assertEquals(result,8);
    }
    @Test
    public void scadereTest(){
        int a=5;
        int b=3;
        int result=calculatorStiintific.scadere(a,b);
        assertEquals(result,2);
    }
    @Test
    public void inmultireTest(){
        int a=6;
        int b=3;
        int result=calculatorStiintific.inmultire(a,b);
        assertEquals(result,18);
    }
    @Test
    public void impartireTest(){
        int a=6;
        int b=3;
        int result=calculatorStiintific.impartire(a,b);
        assertEquals(result,2);
    }

    @Test
    public void ridicareLaPutereTest(){
        double a=3;
        double b=2;
        double result=calculatorStiintific.ridicareLaPutere(a,b);
        assertEquals(result,9);
    }

    @Test
    public void radicalTest(){
        double a=9;
        double result=calculatorStiintific.radical(a);
        assertEquals(result,3);
    }
}
