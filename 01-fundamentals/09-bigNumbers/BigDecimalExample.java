
import java.math.BigDecimal;


void main() {
    double aDouble = Double.MAX_VALUE; 
    double aDouble2 = Double.MIN_VALUE;
    BigDecimal bigNumber01 = new BigDecimal("123412341234123412342341234.1645767894564567568778768");
    BigDecimal bigNumber02 = new BigDecimal("0.2");
    BigDecimal bigNumber03 = bigNumber01.add(bigNumber02);
    BigDecimal bigNumber04 = bigNumber01.multiply(bigNumber02);
    BigDecimal bigNumber05 = bigNumber01.divide(bigNumber02);
    BigDecimal bigNumber06 = bigNumber01.subtract(bigNumber02);

    System.out.println("El resultado de sumar = " + bigNumber03);
    System.out.println("El resultado de multiplicar = " + bigNumber04);
    System.out.println("El resultado de dividir = " + bigNumber05);
    System.out.println("El resultado de restar = " + bigNumber06);
}
