import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int pre = -1;
        
        List<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            if(pre != n){
                list.add(n);
                pre = n;
            }
        }
        
        return list.stream().mapToInt(v->v).toArray();
    }
}