function solution(s) {
  return s.split(' ').map(v=>v.substr(0,1).toUpperCase() + v.substr(1).toLowerCase()).join(' ')
}