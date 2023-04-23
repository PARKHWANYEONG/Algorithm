function solution(n, k) {
    return Array.from({length:n},(_,i)=>1+i).filter(v=>!(v%k))
}