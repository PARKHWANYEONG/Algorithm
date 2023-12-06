import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
