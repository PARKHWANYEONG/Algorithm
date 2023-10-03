import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 1){
            return IntStream.range(0,arr.length).map(i-> i%2 == 0 ? arr[i]+n : arr[i]).toArray();
        }else{
            return IntStream.range(0,arr.length).map(i-> i%2 == 1 ? arr[i]+n : arr[i]).toArray();
        }
    }
}