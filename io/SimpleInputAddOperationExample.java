import java.io.IOException;
import java.io.Console;

void main() throws IOException {
    Console console = System.console();
    System.out.print("Numero a: ");
    String a = console.readLine();
    System.out.print("Numero b: ");
    String b = console.readLine();
    int numeroA = Integer.parseInt(a);
    int numeroB = Integer.parseInt(b);
    int total = numeroA + numeroB;
    System.out.printf("La suma es %d", total);
}