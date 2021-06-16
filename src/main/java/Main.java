public class Main {
    public static void main(String[] args) {
        int credit = 200000;
        double stavka = 12;
        int time = 24;
        CreditСalculation creditСalculation = new CreditСalculation(credit, stavka, time);
        System.out.printf("Расчет аннуитетного платежа на сумму кредита %d рублей, с процентной ставкой %.2f, сроком на %d месяца: \n", credit, stavka, time);
        int payment = creditСalculation.paymentСalculation();
        System.out.println(payment);

        int sum = creditСalculation.refundAmount(payment);
        System.out.println("общая сумма к возврату в банк: " + sum);

        int overpayment = creditСalculation.overpaymentCalc(sum);
        System.out.println("переплата за весь период составит: " + overpayment);
    }
}
