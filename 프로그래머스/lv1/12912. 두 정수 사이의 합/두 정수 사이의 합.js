function solution(a, b) {
    return Array.from({length:Math.abs(a-b)+1},(_,i)=>Math.min(a,b)+i).reduce((a,c)=>a+c,0)
}