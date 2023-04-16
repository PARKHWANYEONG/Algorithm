function solution(k, score) {
    let day = score.length;
    let arr = [];
    let answer = [];
    for(let i=0; i<day; i++){
        if(arr.length < k) arr.push(score[i])
        else {
            arr.push(score[i])
            arr.sort((a,b)=>b-a);
            arr.pop();
        }
        
        let min = Math.min(...arr);
        answer.push(min);
    }
    return answer;
}