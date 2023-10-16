import java.util.*;

class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        recursive("",numbers);
    
        return (int) set.stream().filter(i-> isPrime(i)).count();
    }
    
    void recursive(String comb, String others){
        if(!comb.equals("")){
            set.add(Integer.parseInt(comb));
        }
        for(int i=0; i<others.length(); i++){
            recursive(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }
    }
    boolean isPrime(int num){
        if(num == 1 || num == 0) return false;
        
        for(int i=2; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}