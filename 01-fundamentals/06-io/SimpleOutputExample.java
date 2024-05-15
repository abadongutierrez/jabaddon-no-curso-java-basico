import java.util.Formattable;
import java.util.Formatter;

void main() {
    System.out.print(1);
    System.out.print(1.0);
    System.out.print(true);
    System.out.println("--- Obj ----");
    Persona obj = new Persona("John", "Connor");
    System.out.print(obj);
    System.out.println("\n--- Obj ----");
    System.out.println("Hi there!");
    System.out.print("despues del salto de linea");
    System.err.println("esto va al error");

    System.out.printf("[%s, %s, %s]", obj.nombre, obj.apellido, null);
    System.out.println();
    System.out.printf("numeros [%d, %o]", 10, 8);
    // decimal: 0 - 9: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    // octal: 0 - 7: 0, 1, 2, 3, 4, 5, 6, 7, 10

    System.out.println("\nDecimales:");
    // decimal
    for (int i = 0; i < 20; i++) {
        System.out.printf(" %d", i);
    }
    System.out.println("\nOctales:");
    // octales
    for (int i = 0; i < 20; i++) {
        System.out.printf(" %o", i);
    }
}

class Persona extends Object {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        //return "[" + this.nombre + ", " + this.apellido + "]";
        return String.format("[%s, %s]", this.nombre, this.apellido);
    }
}

class PersonaFormateable implements Formattable {
    @Override
    public void formatTo(Formatter formatter,
              int flags,
              int width,
              int precision) {
                System.out.printf("[%s, %d, %d, %d]", formatter, flags, width, precision);
              }
}
