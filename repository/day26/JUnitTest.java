package day26;

import org.junit.Test;

import java.util.Date;

/**
 * @author : Ren
 * @Date : 2022/08/10/14:16
 * @Param :
 */
public class JUnitTest {

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

      //ClassCastException
      /*  Object obj = new String("GG");
        Date date = (Date) obj;*/
    }
}
