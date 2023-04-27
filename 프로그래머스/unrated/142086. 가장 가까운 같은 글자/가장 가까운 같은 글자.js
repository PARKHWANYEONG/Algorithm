function solution(s) {
    let answer = [];
    let temp = {};
    
    for(let i=0; i<s.length; i++){
        if(temp[s[i]] === undefined){
            temp[s[i]] = i;
            answer.push(-1);
        }else{
            answer.push(i - temp[s[i]]);
            temp[s[i]] = i;
        }
    }
    return answer
}