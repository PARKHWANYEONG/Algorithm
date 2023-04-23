function solution(a, b) {
    if( a%2 && b%2 ) return a*a + b*b
    if( a%2 || b%2) return 2*(a+b)
    if(!(a%2 && b%2)) return Math.abs(a-b)
}