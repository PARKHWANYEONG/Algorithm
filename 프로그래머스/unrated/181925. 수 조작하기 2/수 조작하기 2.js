function solution(numLog) {
    let prev = numLog[0];
    let answer = '';
    
    for(let i=1; i<numLog.length; i++){
        let current = numLog[i];
        if(prev + 1 === current){
            answer += 'w';
        }else if(prev - 1 === current){
            answer += 's';
        }else if(prev + 10 === current){
            answer += 'd';
        }else if(prev - 10 === current){
            answer += 'a';
        }
        prev = current;
    }
    
    return answer;
}