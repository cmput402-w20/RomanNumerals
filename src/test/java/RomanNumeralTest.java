import org.junit.Test;
/**
 * Created by snadi on 2019-01-30.
 */
public class RomanNumeralTest {

    @Test
    public void testConvert1Char(){
        assert(RomanNumeral.convert("I") == 1);
    }

    @Test
    public void testConvert3Char(){
        assert(RomanNumeral.convert("III") == 3);
    }

    @Test
      public void testConvertStartWithV(){
        assert(RomanNumeral.convert("VI") == 6);
    }

    @Test
     public void testConvertEndWithV(){
        assert(RomanNumeral.convert("IV") == 4);
    }

    @Test
    public void testConvert3CharV(){
        assert(RomanNumeral.convert("XVI") == 16);
    }

       @Test
    public void testConvert3CharVEnd(){
        assert(RomanNumeral.convert("XIV") == 14);
    }

//    @Test
//    public void testConvertMMiddle(){
//        assert(RomanNumeral.convert("MV") == 1005);
//    }



}
