
import java.math.BigInteger;


void main() {
    System.out.println("Hello Java 23!");
    long aLong = Long.MAX_VALUE;
    long aLong2 = Long.MIN_VALUE;
    BigInteger bigNumber01 = new BigInteger("1453453456734567567867978452312323412343244645674784566354634563456123142341234125451234435354698698489459845959595");
    BigInteger bigNumber02 = new BigInteger("2");
    BigInteger bigNumber03 = bigNumber01.add(bigNumber02);
    BigInteger bigNumber04 = bigNumber01.multiply(bigNumber02);
    BigInteger bigNumber05 = bigNumber01.divide(bigNumber02);
    BigInteger bigNumber06 = bigNumber01.subtract(bigNumber02);

    System.out.println("El resultado de sumar = " + bigNumber03);
    System.out.println("El resultado de multiplicar = " + bigNumber04);
    System.out.println("El resultado de dividir = " + bigNumber05);
    System.out.println("El resultado de restar = " + bigNumber06);
}