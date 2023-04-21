function solution(nums) {
    let arr = [];
    let answer= 0;
   for(let i=0; i<nums.length-2; i++){
       for(let j=i+1; j<nums.length-1; j++){
           for(let k=j+1; k<nums.length; k++){
               arr.push(nums[i] + nums[j] + nums[k])
           }
       }
   }
    let cnt;
    for(let m=0; m<arr.length; m++){
         cnt = 0;
        for(let n=2; n<arr[m]; n++){
            if(arr[m]%n===0) cnt++
        }
        if(!cnt) answer++
    }
    return answer
}