function solution(s) {
  return s.split(' ').map(v=>[...v].map((v2,i)=>i%2? v2.toLowerCase():v2.toUpperCase()).join('')).join(' ')
}