function solution(n) {
    let cnt = n.toString(2).match(/1/g).length;
    
    while(true){
        n++;
        if(cnt === n.toString(2).match(/1/g).length) return n
    }
}