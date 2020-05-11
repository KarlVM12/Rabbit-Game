import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TestClass extends TestCase
{

    private Class _cla;

    @Before
    public void setUp()
    {
        _cla = new Class(/* parameters */);
    }

    @After
    public void tearDown()
    {
        _cla = null;
    }

    @Test
    public void testCreation()
    {
        //this.assertTrue("Error Message", computation ); 
        //this.assertFalse("Error Message", computation );
        //this.assertEquals("Error Message", actualValue, computation );
    }

    @Test
    public void testEquality()
    {
        Class myclass = new Class(/* parameters */);
        boolean result = _cla.equals(myclass); // need equals() method in class to actually compare
        assertTrue("Error in testEquality", result);
    }

    @Test
    public void testInequality()
    {
        Class myclass = new Class(/* parameters */);
        boolean result = _cla.equals(myclass); // need equals() method in class to actually compare
        assertFalse("Error in testInequality", result);
    }


}