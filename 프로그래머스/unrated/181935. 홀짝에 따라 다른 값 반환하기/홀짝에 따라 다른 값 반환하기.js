function solution(n) {
  let odd = Array.from({length:n},(_,i)=>i+1).filter(v=> v%2).reduce((a,c)=>a+c,0);
  let even = Array.from({length:n},(_,i)=>i+1).filter(v=> !(v%2)).reduce((a,c)=>a+ c**2,0)
  return n%2 ? odd : even
}