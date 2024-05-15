
void main() {
    System.out.println("Inicio");
    int numero = 10;
    switch (numero) {
        case 1:
        case 10:
        case 20:
            System.out.println("UNO");
            break;
        case 2:
            System.out.println("DOS");
            break;
        //..
        default:
            System.out.println("Desconozco ese numero");
    }

    System.out.println("-------");

    if (numero == 1) {
        System.out.println("UNO");
    } else if (numero == 2) {
        System.out.println("DOS");
    } else {
        System.out.println("Desconozco ese numero");
    }

    System.out.println("Fin");
}