import java.io.IOException;
import java.io.Console;

void main() throws IOException {
    Console console = System.console();
    String input = console.readLine();
    System.out.println(input);
}
