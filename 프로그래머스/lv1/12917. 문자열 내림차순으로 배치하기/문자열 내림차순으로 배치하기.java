class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        int leng = charArray.length;

        for (int i = 0; i < leng - 1; i++) {
            for (int j = 0; j < leng - i - 1; j++) {
                if (charArray[j] < charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j+1] = temp;
                }
            }
        }
        return String.valueOf(charArray);
    }
}