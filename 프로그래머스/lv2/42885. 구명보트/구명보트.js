function solution(people, limit) {
    
    people.sort((a,b)=>a-b);
    
    let cnt = 0;
    for(var l=0,r=people.length-1; l<r; r--){
        if((people[l] + people[r]) <= limit){
            cnt++;
            l++;
        }else{
            cnt++;
        }
    }
    if(l === r){
        cnt ++;
    }
    return cnt;
}