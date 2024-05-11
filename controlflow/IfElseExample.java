import java.util.Scanner;

void main() {
    System.out.println("Inicio");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Condicional?: ");
    boolean conditional = scanner.nextBoolean();
    if (conditional == true) {
        System.out.println("Dentro del if");
    } else {
        System.out.println("Dentro del else");
    }
    System.out.println("Fin");
}