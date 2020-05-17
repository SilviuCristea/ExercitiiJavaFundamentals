import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator=new Calculator();

    @Test
    public void adunareTest(){
        int a=5;
        int b=3;
        int result=calculator.adunare(a,b);

        assertEquals(result,8);
    }
    @Test
    public void scadereTest(){
        int a=5;
        int b=3;
        int result=calculator.scadere(a,b);
        assertEquals(result,2);
    }
    @Test
    public void inmultireTest(){
        int a=6;
        int b=3;
        int result=calculator.inmultire(a,b);
        assertEquals(result,18);
    }
    @Test
    public void impartireTest(){
        int a=6;
        int b=3;
        int result=calculator.impartire(a,b);
        assertEquals(result,2);
    }





}
