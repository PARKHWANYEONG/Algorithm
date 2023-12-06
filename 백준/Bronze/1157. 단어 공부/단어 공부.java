import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        String answer = "";
        int max = 0;
        boolean isDuple = false;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();

            if (max < count) {
                answer = String.valueOf(entry.getKey());
                max = count;
                isDuple = false;
            } else if (max == count) {
                isDuple = true;
            }
        }

        if (isDuple) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}