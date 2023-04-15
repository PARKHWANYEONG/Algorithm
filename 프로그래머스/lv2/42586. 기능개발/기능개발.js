function solution(P, S) {
    let answer = [];
    
    while(S.length){
        S.forEach((v,i)=> P[i]+=S[i]);
        let cnt = 0;
        
        while(P[0]>=100){
            P.shift();
            S.shift();
            cnt++;
        }
        if(cnt>0) answer.push(cnt);
    }
    return answer;
}