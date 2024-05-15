import java.util.Scanner;

void main() {
    System.out.println("Inicio");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hasta donde quieres que cuente?: ");

    int limite = 50;
    long input = scanner.nextInt();

    while (input > 50) {
        System.out.printf("Error! el numero maximo soportado es %d\n", limite);
        System.out.print("Hasta donde quieres que cuente?: ");
        input = scanner.nextInt();
    } 

    /*
    for ((1); (2); (4)) {
        (3)
    }
    */

    // 0 < 10, 1 < 10, ..., 9 < 10, 10 < 10 (X)
    for (int indice = 0; indice < input; indice = indice + 1) {
        if (indice % 2 == 0) { // el numero es par
            continue;
        }
        // solo imprimo el impar
        System.out.println(indice);
    }
    
    System.out.println("Fin");
}