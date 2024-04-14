
void main() {
    System.out.println(2 + 2);
    System.out.println(5 - 3);
    System.out.println(10 / 2);
    System.out.println(5 * 2);
    System.out.println(1 + 2 * 3 / 2);
    System.out.println(1 + ((2 * 3) / 2));
    System.out.println((1 + 2));
    System.out.println((3 / 2)); // 1.5 -> 1
    System.out.println((3 / 2.0F));
    System.out.println((1 + 2) * (3 / 2));
    // module (el restante de la division)
    System.out.println(6 % 2);
    // igualdad (equality)
    System.out.println(6 == 6);
    System.out.println(6 == 5);
    System.out.println(6 != 5);
    System.out.println(6 > 5);
    System.out.println(6 >= 5);
    System.out.println(6 < 5);
    System.out.println(6 <= 5);

    // unarios (unary)
    int cinco = 5;
    System.out.println(cinco + 1); // 6
    System.out.println(cinco);
    System.out.println(cinco++); // 5 ? -> suma 1 despues de usar la variable
    System.out.println(cinco); // 6
    System.out.println(++cinco); // 7 ? -> suma 1 antes de usar la variable
    int diez = 10;
    System.out.println(diez - 1); // 9
    System.out.println(diez--); // 10 ? -> resta 1 despues de usar la variable
    System.out.println(diez); // 9
    System.out.println(--diez); // 8
}