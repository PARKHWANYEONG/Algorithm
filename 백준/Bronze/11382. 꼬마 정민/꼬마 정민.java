import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToLong(Long::parseLong)
                .sum();

        System.out.println(sum);
    }
}