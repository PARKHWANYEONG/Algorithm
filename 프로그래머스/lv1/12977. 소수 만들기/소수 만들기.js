function solution(nums) {
    const isPrime = (num)=> {
        for(let i=2; i<=Math.sqrt(num); i++){
            if(num%i===0){
                return false;
            }
        }
        return true;
    }
    
    let answer = 0;
    
    for(let j=0; j<nums.length-2; j++){
        for(let k=j+1; k<nums.length-1; k++){
            for(let z=k+1; z<nums.length; z++){
                if(isPrime(nums[j]+nums[k]+nums[z])){
                    answer++;
                }
            }
        }
    }
    return answer;
}