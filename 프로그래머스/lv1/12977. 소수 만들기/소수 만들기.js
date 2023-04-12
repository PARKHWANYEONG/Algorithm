function solution(nums) {
    let arr = [];
    let answer = 0;
    let length = nums.length;
    for(let i=0; i<length-2; i++){
        for(let j=i+1; j<length-1; j++){
            for(let k=j+1; k<length; k++){
                arr.push(nums[i]+nums[j]+nums[k])
            }
        }
    }
    for(let m=0; m<arr.length; m++){
         let cnt = 0;
        for(let n=1; n<arr[m]; n++){
            if(arr[m]%n===0){
                cnt++;
            }
        }
        if(cnt===1) answer++;
    }
    return answer;
}