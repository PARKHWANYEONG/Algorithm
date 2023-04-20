function solution(people, limit) {
    people.sort((a,b)=>a-b);
    let cnt = 0;
    let left = 0 ,right=people.length-1;
    while(left<right){
        if(people[left] + people[right] <=limit){
            left++;
            right--;
            cnt++;
        }else{
            right--;
            cnt++
        }
    }
    if(left===right) cnt++;
    return cnt;
}