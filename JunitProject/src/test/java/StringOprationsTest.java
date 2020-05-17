import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringOprationsTest {

    //Instantiem un obiect pentru clasa StringOperations

    StringOperations stringOperations=new StringOperations();

    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("Am incepute sa rules clasa test");
    }

    @Before
    public void beforeTest(){
        System.out.println("Am incepute sa rulez");
    }

    @Test
    public void stringLengthTest(){
        String text="Alex";
        int rezult=stringOperations.stingLength(text);

        assertEquals(rezult,4);
    }

    @Test
    public void stringConcatTest(){
        String text1="Ana";
        String text2="Mere";

        String result=stringOperations.stringConcat(text1,text2);

        assertEquals(result, "AnaMere");
    }
    @Test
    public void stringContainsTest(){
        String text1="Ioana";
        String text2="ana";
        boolean result=stringOperations.stringContains(text1, text2);
        assertTrue(result);
    }

    @After
    public void afterTest(){
        System.out.println("Am rulat");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("Done");
    }

}
