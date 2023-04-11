function solution(s){
    let cnt = 0;
    for(let i=0; i<s.length; i++){
        if(s[i]==='('){
            cnt++;
        }else{
            cnt--;
        }
    }
    if(cnt!==0) return false
    
    let result = [];
    
    for(let v of s){
        if(v==='('){
            result.push(v);
        }else{
            if(result.length===0){
                return false;
            }
            result.pop();
        }
    }
    return true;
}

