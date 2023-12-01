class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        int width = 0;
        int minWidth = 3;

        for (int i = minWidth; i < brown; i++) {
            int height = sum / i;
            if (height > i) {
                continue;
            }
            if ((i * 2) + (height - 2) * 2 == brown) {
                width = i;
                break;
            } 
        }

        answer[0] = width;
        answer[1] = sum / width;

        return answer;
    }
}