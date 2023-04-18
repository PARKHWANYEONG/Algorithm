function solution(x, n) {
   return Array.from({length:n},()=>x).map((v,i)=>v*(i+1))
}