function solution(s) {
    let ob = {}
    let answer = []
    for(let i=0; i<s.length; i++){
        if(ob[s[i]]===undefined){
            ob[s[i]] = i;
            answer.push(-1);
        }else{
            answer.push(i-ob[s[i]]);
            ob[s[i]] = i;
        }
    }
    return answer
}