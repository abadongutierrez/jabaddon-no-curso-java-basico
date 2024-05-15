
void main() {
    // Variables
    int miVariable1 = 2;

    int miVariable2;
    // ...
    miVariable2 = 100;

    miVariable1 = 200;

    miVariable2 = 1000;

    // Constantes
    final int miConstante = 2;
    // error, no se puede cambiar una "constante" final
    //miConstante = 200;

    Nombre nombre = new Nombre();
    nombre.nombre = "John";
    nombre.apellido = "Smith";
    nombre.edad = 34;
    System.err.println(nombre.nombre + ", " + nombre.apellido + ", " + nombre.edad);
    Nombre nombreBackup = nombre;

    nombre = new Nombre();
    System.err.println(nombre.nombre + ", " + nombre.apellido + ", " + nombre.edad);
    System.err.println(nombreBackup.nombre + ", " + nombreBackup.apellido + ", " + nombreBackup.edad);

    final Nombre nombreFinal = new Nombre();
    nombreFinal.nombre = "Sarah";
    nombreFinal.apellido = "Connor";
    nombreFinal.edad = 21;
    System.err.println(nombreFinal.nombre + ", " + nombreFinal.apellido + ", " + nombreFinal.edad);

    // error
    //nombreFinal = new Nombre();
    nombreFinal.edad = 22;
    System.err.println(nombreFinal.nombre + ", " + nombreFinal.apellido + ", " + nombreFinal.edad);

    Nombre aux = nombreFinal;
    System.err.println(aux.nombre + ", " + aux.apellido + ", " + aux.edad);

    aux = new Nombre();
}

class Nombre {
    // atributos de la clase (objeto)
    String nombre;
    String apellido;
    int edad;
}
