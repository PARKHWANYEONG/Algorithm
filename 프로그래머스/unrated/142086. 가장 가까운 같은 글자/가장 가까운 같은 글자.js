function solution(s) {
    let temp = [];
    let answer = [];
    for(let i=0; i<s.length; i++){
        if(temp.includes(s[i])){
          answer.push(temp.length - temp.lastIndexOf(s[i]))
          temp.push(s[i]);
        }else{
          temp.push(s[i]);
          answer.push(-1)
        }
    }
    return answer;
}