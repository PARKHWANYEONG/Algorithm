function solution(n, words) {
    let temp= [];
   for(let i=0; i<words.length-1; i++){
        if(words[i].slice(-1) !== (words[i+1]).slice(0,1)){
           return [(i+1)%n+1 , Math.ceil((i+2)/n)]
        }
       if(temp.includes(words[i])){
          return [(i+1)%n+1 ,Math.ceil((i+2)/n)]
          }
       if(temp.includes(words[i+1])){
          return [(i+1)%n+1 ,Math.ceil((i+2)/n)]
          }
        temp.push(words[i]);
    }
    return [0,0]
}
