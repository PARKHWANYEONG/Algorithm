import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int choice = nums.length/2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],0);
        }
        int kind = map.keySet().size();
        
        if(kind <= choice){
            return kind;
        }
        return choice;
    }
}