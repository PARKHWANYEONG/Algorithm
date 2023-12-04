import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer;

        if (a > 0 && b > 0) {
            answer = 1;
        } else if (a > 0 && b < 0) {
            answer = 4;
        } else if (a < 0 && b < 0) {
            answer = 3;
        } else{
            answer = 2;
        }

        System.out.println(answer);
    }
}