import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            if(Character.isLowerCase(a)){
                answer += Character.toUpperCase(a);
            } else {
                answer += Character.toLowerCase(a);
            }
        }
        System.out.println(answer);
    }
}