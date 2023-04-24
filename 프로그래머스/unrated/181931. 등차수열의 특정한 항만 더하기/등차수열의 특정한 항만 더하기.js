function solution(a, d, included) {
    return included.map((v,i)=> a+d*i).filter((_,i)=> included[i]).reduce((a,c)=>a+c,0)
}