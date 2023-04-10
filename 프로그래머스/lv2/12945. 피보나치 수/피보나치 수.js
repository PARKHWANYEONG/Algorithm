function solution(n) {
    let answer= [];
    for(let i=0; i<=n; i++){
        if(i===0) answer.push(0);
        if(i===1) answer.push(1);
        if(i>=2) answer.push((answer[i-2]+answer[i-1])%1234567);
    }
    return answer[n]
}