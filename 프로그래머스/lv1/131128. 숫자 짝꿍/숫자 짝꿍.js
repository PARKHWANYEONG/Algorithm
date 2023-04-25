function solution(X, Y) {
    let temp = {};
    let answer = ''
    
    for(let i=0; i<X.length; i++){
        temp[X[i]] = (temp[X[i]] || 0) + 1;
    }
    
    for(let j=0; j<Y.length; j++){
        if(temp[Y[j]]){
            temp[Y[j]]--;
            answer += Y[j];
        }
    }
    if(!answer) return '-1';
    if(!(answer*1)) return '0';
    return [...answer].sort((a,b)=> +b - +a).join('')
}