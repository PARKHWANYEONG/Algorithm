function solution(n) {
    let oneCnt = n.toString(2).split('').filter(v=> v === '1').length;
    while(true){
        n++;
        let temp = n.toString(2).split('').filter(v=> v === '1').length;
        if(temp ===oneCnt){
            return n
        }
    }
    
}