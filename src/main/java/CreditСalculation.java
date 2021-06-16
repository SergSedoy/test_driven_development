public class CreditСalculation {
    private int credit;
    private double stavka;
    private int time;

    public CreditСalculation(int credit, double stavka, int time) {
        this.credit = credit;
        this.stavka = stavka;
        this.time = time;
    }

    public int paymentСalculation() {
        double P = stavka / 100 / 12;
        return (int) (credit * (P + (P / ((Math.pow((1 + P), time) - 1)))));

    }

    public int refundAmount(int payment) {
        return time * payment;
    }

    public int overpaymentCalc(int sum) {
        return sum - credit;
    }
}
