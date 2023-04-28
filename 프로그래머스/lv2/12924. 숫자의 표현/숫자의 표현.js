function solution(n) {
    let answer =0;
    
    for(let i=1; i<=n; i++){
        if(check(i,0,n)) answer++;
    }
    
    return answer;
}

const check = (start,sum,end)=>{
    if(sum === end) return true;
    if(sum > end) return false;
    return check(start +1,sum+start,end)
}