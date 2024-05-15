
void main() {
    String miPrimeraCadena = "Hola Mundo!!";
    System.out.println(miPrimeraCadena);
    System.out.println("El tamaño de la cadena es: " + miPrimeraCadena.length());
    System.out.println("startsWith: " + miPrimeraCadena.startsWith("Hola "));
    System.out.println("startsWith: " + miPrimeraCadena.startsWith("Hola N"));
    System.out.println("endsWith: " + miPrimeraCadena.endsWith("Hola"));
    System.out.println("endsWith: " + miPrimeraCadena.endsWith("!"));
    System.out.println("endsWith: " + miPrimeraCadena.endsWith("do!!"));
    System.out.println("toUpperCase: " + miPrimeraCadena.toUpperCase());
    System.out.println("toLowerCase: " + miPrimeraCadena.toLowerCase());
    System.out.println("Hola".concat(" Mundo!"));
    System.out.println("Hola" + " Mundo!");
    String emptyString = "";
    System.out.println("Cadena vacia? " + emptyString.isEmpty());
    System.out.println("Cadena blank? " + emptyString.isBlank());
    String stringConEspacios = "   ";
    System.out.println("Cadena vacia? " + stringConEspacios.isEmpty());
    System.out.println("Cadena blank? " + stringConEspacios.isBlank());

    System.out.println("0123456789".substring(0, 2)); // 0, 2-1
    System.out.println("0123456789".substring(5, 8));
    String numbers = "0123456789";
    System.out.println(numbers.substring(5, numbers.length()));
    System.out.println(numbers.substring(5));

    String unSoloCaracter = "a";
    char miA = 'a';

    int numero = 4334;
    String numeroComoCadena = String.valueOf(numero);
    System.out.println(numeroComoCadena);
}