
void main() {
    System.out.println("Inicio");
    testUserResponse("y");
    testUserResponse("Y");
    testUserResponse("n");
    testUserResponse("N");
    testUserResponse("yes");
    testUserResponse("YES");
    testUserResponse("yEs");
    testUserResponse("YeS");
    testUserResponse("no");
    testUserResponse("NO");
    testUserResponse("maybe");
    testUserResponse(null);
    System.out.println("Fin");
}

 void testUserResponse(String response) {
    System.out.print("User response [" + response + "]: ");
    switch (response) {
        case null -> { }
        case "y", "Y" -> {
            System.out.println("You got it");
        }
        case "n", "N" -> {
            System.out.println("Shame");
        }
        case String s when s.equalsIgnoreCase("YES") -> {
            System.out.println("You got it");
        }
        case String s when s.equalsIgnoreCase("NO") -> {
            System.out.println("Shame");
        }
        case String s -> {
            System.out.println("Sorry?");
        }
    }
}
