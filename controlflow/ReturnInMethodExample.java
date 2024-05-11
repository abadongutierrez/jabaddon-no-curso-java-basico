import java.util.Scanner;

void main() {
    System.out.println("Inicio");
    Scanner scanner = new Scanner(System.in);
    System.out.print("En que numero estoy pensando entre 1 y 10?: ");

    int numero = 8;
    int input = scanner.nextInt();
    if (input != numero) {
        System.out.println("Error");
        return;
    }
    System.out.println("Correcto!");
    System.out.println("Fin");
}