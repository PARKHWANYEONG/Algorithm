import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        if (min < 45) {
            if (hour - 1 < 0) {
                hour = 23;
            } else {
                hour--;
            }
            min += 15;
        } else {
            min -= 45;
        }
        String answer = hour + " " + min;
        
        System.out.println(answer);
    }
}