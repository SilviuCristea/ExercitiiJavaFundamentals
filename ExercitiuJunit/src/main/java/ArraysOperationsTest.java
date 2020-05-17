import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysOperationsTest {

    ArreysOperations arreysOperations=new ArreysOperations();

    @Test
    public void lunfimeArrayTest(){
       int[] array = {12, 4, 3, 17, 20};
       int result = arreysOperations.lungimeArray(array);
       assertEquals(result,5);
    }

    @Test
    public void numereMaiMariTest(){
        int[] array = {12, 4, 3, 17, 20};
        int result=arreysOperations.numereMaiMari(array);
        assertEquals(result,3);
    }
}
