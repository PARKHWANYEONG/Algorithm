import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                firstIndex = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 2){
                lastIndex = i;
                break;
            }
        }
        
        if(firstIndex == -1){
            return new int[]{-1};
        }
        
        if(firstIndex == lastIndex){
            return new int[]{2};
        }
        
        return Arrays.copyOfRange(arr,firstIndex,lastIndex+1);
            
    }
}