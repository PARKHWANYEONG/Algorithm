function solution(n) {
   let select = n.length/2;
    
    if(new Set(n).size >= select){
        return select;
    }else {
        return new Set(n).size
    }
}

