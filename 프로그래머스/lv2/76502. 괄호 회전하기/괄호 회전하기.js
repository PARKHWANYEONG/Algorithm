function solution(s) {
    var answer = 0;
    
    for(let i=0; i<s.length; i++){
        let temp = s.slice(i) + s.slice(0,i);
        let stack = [];
        let result = true;
        if(temp[0] === ')'|| temp[0] === '}'|| temp[0] === ']') continue;
        for(let j=0; j<s.length; j++){
            if(temp[j] === '{'||temp[j] === '['||temp[j] === '('){
                stack.push(temp[j]);
            }else{
                let temp2 = stack.pop();
                if(temp2 === '{' && temp[j] === '}') continue;
                if(temp2 === '(' && temp[j] === ')') continue;
                if(temp2 === '[' && temp[j] === ']') continue;
                result = false;
                break;
            }
        }
        if(result) answer++
    }
    return s.length%2 ? 0 : answer
}