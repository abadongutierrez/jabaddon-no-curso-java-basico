
import java.math.BigDecimal;
import java.text.NumberFormat;

void main() {
    // the issue with the IEEE 754 standard
    double double01 = 0.1;
    double double02 = 0.2;
    double expected = 0.3;
    double double03 = double01 + double02;
    System.out.println("El resultado de sumar = " + double03);
    System.out.println(double03 == expected);

    BigDecimal bigDecimal01 = new BigDecimal("0.1");
    BigDecimal bigDecimal02 = new BigDecimal("0.2");
    BigDecimal bigDecimal03 = bigDecimal01.add(bigDecimal02);
    System.out.println("El resultado de sumar = " + bigDecimal03);

    float a = 8_250_325.12f;
    float b = 4_321_456.31f;
    float c = a + b;
    System.out.println(NumberFormat.getCurrencyInstance().format(c));

    // BigDecimal to the rescue!
    BigDecimal a1 = new BigDecimal("8250325.12");
    BigDecimal b1 = new BigDecimal("4321456.31");
    BigDecimal c1 = a1.add(b1);
    System.out.println(NumberFormat.getCurrencyInstance().format(c1));
}