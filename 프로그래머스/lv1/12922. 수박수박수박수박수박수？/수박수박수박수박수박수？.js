function solution(n) {
    return n%2? '수박'.repeat(Math.ceil(n/2)).slice(0,-1) : '수박'.repeat(Math.ceil(n/2))
}