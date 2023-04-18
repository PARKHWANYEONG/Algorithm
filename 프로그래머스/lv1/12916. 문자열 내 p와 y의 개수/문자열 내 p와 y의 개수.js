function solution(s){
   let arr = s.toLowerCase().split('');
    return arr.filter(v=>v==='p').length === arr.filter(v=>v==='y').length ? true : false
}