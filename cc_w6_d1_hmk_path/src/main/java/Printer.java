public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {

        this.paper = paper;
        this.toner = toner;
}

    public int getNumber() {
        return this.paper;
    }

    public int printPaper() {
        return this.paper -= 1;
    }

    public int refillPrinter() {
        return this.paper += 50;
    }

    public int getToner() {
        return this.toner;
    }

    public int tonerDecrease() {
        return this.toner -= 1;
    }
}
