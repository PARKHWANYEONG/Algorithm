function solution(num , cnt=0) {
    if(num===1) return cnt
    if(cnt >500) return -1
    return num%2 ? solution(num*3+1 ,++cnt) : solution(num/2,++cnt)
}