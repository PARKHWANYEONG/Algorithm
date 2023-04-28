function solution(n) {
    let set = new Set();
    
    for(let i=1; i<=n; i+=2){
        set.add(i);
    }
    
    for(let j=2; j<=Math.sqrt(n); j++){
            if(set.has(j))
        for(let k=j*2; k<=n; k+=j){
                set.delete(k);
        }
    }
    
   return set.size
}