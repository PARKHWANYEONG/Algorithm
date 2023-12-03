class Solution {
    public String solution(String new_id) {
        String replaced = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if (replaced.isEmpty()) {
            replaced += "a";
        }

        if (replaced.length() >= 16) {
            replaced = replaced.substring(0, 15);
            if (replaced.endsWith(".")) {
                replaced = replaced.replaceAll("[.]$", "");
            }
        }

        while (replaced.length() <= 2) {
            replaced += replaced.charAt(replaced.length() - 1);
        }

        return replaced;
    }
}