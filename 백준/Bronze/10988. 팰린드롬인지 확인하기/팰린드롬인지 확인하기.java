import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;

        while (start < end) {
            if (str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}