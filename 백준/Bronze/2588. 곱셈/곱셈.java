import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] array = Arrays.stream((b + "").split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(a * array[i]);
        }

        System.out.println(a * b);
    }
}