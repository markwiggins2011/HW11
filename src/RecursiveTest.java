import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by mark.wiggins on 10/31/2017.
 */
public class RecursiveTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Before
            public  void setup() throws  Exception
            {
                System.setOut(new PrintStream(outContent));
                System.setErr(new PrintStream(errContent));
            }
    @After
    public void tearDown() throws Exception
        {
            System.setOut(null);
            System.setErr(null);
        }

    @Test
    public void printEveryOther() throws Exception
    {
        Recursive.printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
       assertEquals("9753",outContent.toString());
    }
    @Test
    public void printStars() throws Exception
        {
            Recursive.printStars("Hello");
            assertEquals("Hel*lo",outContent.toString());
        }
}