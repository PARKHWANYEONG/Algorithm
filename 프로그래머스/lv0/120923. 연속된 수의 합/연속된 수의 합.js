function solution(num, total) {
    let start = Math.ceil(total/num) - Math.floor(num/2);
    let answer =[]
    for(let i=start; i<start+num; i++){
        answer.push(i)
    }
    return answer;
}