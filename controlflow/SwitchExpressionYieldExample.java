
void main() {
    System.out.println(usingYield("Foo"));
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