function solution(n, words) {
    let temp = {};
    
    temp[words[0]] = true;
    
    for(let i=1; i<words.length; i++){
        if(words[i-1].substr(-1) !== words[i][0] || temp[words[i]] ) {
            return [(i%n)+1 , Math.floor(i/n)+1]
         }
        temp[words[i]]= true;
    }
    
    return [0,0]
}