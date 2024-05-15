
void main() {
    System.out.println(usingYield("Foo"));
    otroMetodo("Foo");
    otroMetodo("Bar");
    otroMetodo("Baz");
}

int otroMetodo(String str) {
    switch (str) {
        case "Foo" -> {
            System.out.println("Foo was matched!"); 
            return 1;
        }
        case "Bar" -> {
            System.out.println("Bar was matched!");
            return 2;
        }
        default -> {
            System.out.println("Default case");
            return 0;
        }
    }
    // Unreachable code
    //System.out.println("After switch");
}

int usingYield(String s) {
    int result = switch (s) {
        case "Foo" -> {
            System.out.println("Foo was matched!");
            yield 1;
        }
        case "Bar" -> 2;
        default -> 0;
    };
    return result;
}