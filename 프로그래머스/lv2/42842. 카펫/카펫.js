function solution(brown, yellow) {
    let sum = brown + yellow;
    
    for(let 가로=3; ; 가로++){
        let 세로 = sum / 가로;
        if(세로 > 가로 || 세로%1 !== 0) continue;
        if((가로-2) * (세로-2) === yellow){
            return [가로,세로]
        }
    }
}