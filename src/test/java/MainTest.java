import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testPayment() {
        int credit = 200000;
        double stavka = 12;
        int time = 24;
        double P = stavka / 100 / 12;
        double payment = credit * (P + (P / ((Math.pow((1 + P), time) - 1))));
        int expected = (int) payment;
        int actualResult = Main.paymentСalculation(credit, stavka, time);

        assertEquals(expected, actualResult);
    }

    @Test
    void testRefundAmount() {
        int time = 24;
        int payment = 9500;
        int expected = time * payment;
        int actualResult = Main.refundAmount(time, payment);

        assertEquals(expected, actualResult);
    }

    @Test
    void testOverpaymentCalc() {
        int credit = 200000;
        int sum = 225000;
        int expected = sum - credit;
        int actualResult = Main.overpaymentCalc(credit, sum);

        assertEquals(expected, actualResult);
    }

}
