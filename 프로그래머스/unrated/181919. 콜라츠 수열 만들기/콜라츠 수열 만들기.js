function solution(n) {
    let answer = []
    while(n > 1){
        if(!(n%2)){
            answer.push(n);
            n/=2;
        }else{
            answer.push(n);
            n = 3 * n + 1
        }
        if(n===1) answer.push(1)
    }
    return answer
}