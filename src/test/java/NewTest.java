import Lesson.Factorial;
import Lesson.Overload;
import org.junit.Test;
public class NewTest {

    @Test
    public void myTest(){
     System.out.println(Factorial.fact(12));
    }

    @Test
    public void testOverload(){
        Overload overload = new Overload();
        System.out.println();
        System.out.println(overload.testOverload("test"));
        System.out.println(overload.testOverload("test","test"));
        System.out.println(overload.testOverload(4));
        System.out.println(overload.testOverload('C'));
    }
}
