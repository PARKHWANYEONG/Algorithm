function solution(s) {
    let answer = 0;
    let stack = [];
    for(let i=0; i<s.length; i++){
        let result = true;
        let temp = s.slice(i) + s.slice(0,i);
        if(temp[0]=== '}'|| temp[0]===']'|| temp[0]=== ')') continue;
        for(let j=0; j<temp.length; j++){
            if(temp[j]==='{'||temp[j]==='['||temp[j]==='('){
                stack.push(temp[j]);
            }else{
                let temp2 = stack.pop();
                if(temp[j]==='}' && temp2 ==='{') continue;
                if(temp[j]===']' && temp2 ==='[') continue;
                if(temp[j]===')' && temp2 ==='(') continue;
                result = false;
                break;
            }
        }
        if(result) answer++;
    }
    return s.length%2 ? 0 : answer
}
