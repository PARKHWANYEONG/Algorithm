function solution(N, stages) {
    let answer = [];
    let length = stages.length;
    for(let i=1; i<=N; i++){
        let temp = stages.filter(v=> v===i).length;
        answer.push([i, temp/length]);
        length -= temp;
    }
    return answer.sort((a,b)=> b[1]-a[1]).map(v=>v[0])
}