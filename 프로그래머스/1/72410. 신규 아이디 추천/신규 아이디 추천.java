class Solution {
    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();

        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch) ||
                    ch == '-' || ch == '_' || ch == '.') {
                answer += ch;
            }
        }

        while (answer.indexOf("..") != -1) {
            answer = answer.replace("..", ".");
        }

        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }

        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length()-1);
        }

        if (answer.isEmpty()) {
            answer += "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0,15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length()-1);
            }
        }

        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}