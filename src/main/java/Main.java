public class Main {
    public static void main(String[] args) {
        int credit = 200000;
        double stavka = 12;
        int time = 24;
        System.out.printf("расчет аннуитетного платежа на сумму кредита %d рублей, с процентной ставкой %.2f, сроком на %d месяца: \n", credit, stavka, time);
        int payment = paymentСalculation(credit, stavka, time);
        System.out.println(payment);

        System.out.println("общая сумма к возврату в банк: ");
        int sum = refundAmount(time, payment);

        System.out.println("переплата за весь период составит: ");
        int overpayment = overpaymentCalc(credit, sum);
    }

    static int paymentСalculation(int credit, double stavka, int time) {
        double P = stavka / 100 / 12;
        return (int) (credit * (P + (P / ((Math.pow((1 + P), time) - 1)))));

    }

    static int refundAmount(int time, int payment) {
        return time * payment;
    }

    static int overpaymentCalc(int credit, int sum) {
        return sum - credit;
    }
}
