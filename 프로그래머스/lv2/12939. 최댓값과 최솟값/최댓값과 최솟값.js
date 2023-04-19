function solution(s) {
    let temp = s.split(' ').map(v=>+v);
    return Math.min(...temp)+' '+Math.max(...temp)
    
}