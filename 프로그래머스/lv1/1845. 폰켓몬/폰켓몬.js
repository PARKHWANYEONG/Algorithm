function solution(nums) {
    let set = new Set();
    
    for(let i=0; i<nums.length; i++){
        set.add(nums[i])
    }
    if(set.size < nums.length/2){
        return set.size;
    }else{
        return nums.length/2
    }
}