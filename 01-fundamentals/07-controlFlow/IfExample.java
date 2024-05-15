import java.util.Scanner;

void main() {
    System.out.println("Inicio");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Condicional?: ");
    boolean conditional = scanner.nextBoolean();
    if (conditional == true) {
        System.out.println("Dentro del if");
    }
    System.out.println("Fin");
}