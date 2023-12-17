class Solution {
    public String solution(int[] food) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 1; i < food.length; i++) {

            int count = food[i] / 2;
            String repeat = String.valueOf(i).repeat(count);

            sb1.append(repeat);
            sb2.insert(0, repeat);
        }

        return sb1.toString() +"0"+sb2.toString();
    }
}