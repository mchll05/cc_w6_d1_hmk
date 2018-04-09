import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(10, 100);
    }

    @Test
    public void howMuchPaper() {
        assertEquals(10, myPrinter.getNumber());
    }

    @Test
    public void printPaperNumber() {
        myPrinter.printPaper();
        assertEquals(9, myPrinter.getNumber());
    }
    @Test
    public void refillPrinterPaper() {
        myPrinter.refillPrinter();
        assertEquals(60, myPrinter.getNumber());
    }

    @Test
    public void howMuchToner() {
        assertEquals(100, myPrinter.getToner());
    }

    @Test
    public void decreaseToner() {
        myPrinter.tonerDecrease();
        assertEquals(99, myPrinter.getToner());
    }
}

