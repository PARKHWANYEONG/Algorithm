function solution(n) {
    let answer = 0;
    for(let i=1; i<=n; i++){
        if(check(i,0,n)) answer++;
    }
    return answer
}

function check(cur,acc,n){
    if(acc === n) return true;
    if(acc > n) return false;
    
    return check(cur +1,acc+cur,n)
}
