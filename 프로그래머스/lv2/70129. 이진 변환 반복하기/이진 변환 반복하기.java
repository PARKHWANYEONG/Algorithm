class Solution {
    public int[] solution(String s) {
        int count = 0;
        int remove = 0;
        
        while(!s.equals("1")){
            int convertLength = s.replaceAll("0","").length();
            remove += s.length() - convertLength;
            s = Integer.toBinaryString(convertLength);
            count++;
        }
        
        return new int[]{count,remove};
    }
}