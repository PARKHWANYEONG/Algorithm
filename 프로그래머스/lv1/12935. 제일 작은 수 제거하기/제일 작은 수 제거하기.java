import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
    
        ArrayList<Integer> answer = new ArrayList<>(); 
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min) continue;
            answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(v->v).toArray();
    }
}