import java.util.Scanner;

void main() {
    System.out.println("Inicio");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hasta donde quieres que cuente?: ");

    int limite = 50;
    long input = scanner.nextLong();

    // 0 < 10, 1 < 10, ..., 9 < 10, 10 < 10 (X)
    for (int indice = 0; indice < input; indice = indice + 1) {
        if (indice >= limite) {
            return;
        }
        System.out.println(indice);
    }

    System.out.println("Fin");
}