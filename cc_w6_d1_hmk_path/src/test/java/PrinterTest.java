import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer();

    }

    @Test
    public void hasName() {
        assertEquals("Paddington", myBear.getName());

    }
}
