import java.io.IOException;
import java.util.Scanner;
import java.io.Console;

// public static void main(String[] args) { ... }
void main() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Numero a: ");
    int numeroA = scanner.nextInt();
    System.out.print("Numero b: ");
    int numeroB = scanner.nextInt();
    int total = numeroA + numeroB;
    System.out.printf("La suma es %d", total);
}